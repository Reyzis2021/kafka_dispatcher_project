package com.reyzis.common.message;

import com.reyzis.common.bean.Source;
import com.reyzis.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeStateMessage extends Message {

    public OfficeStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

}
