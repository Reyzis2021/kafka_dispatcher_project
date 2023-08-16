package com.reyzis.common.message;

import com.reyzis.common.bean.Airport;
import com.reyzis.common.bean.Source;
import com.reyzis.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportStateMessage extends Message {

    private Airport airport;

    public AirportStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirportStateMessage(Airport airport) {
        this();
        this.airport = airport;
    }
}
