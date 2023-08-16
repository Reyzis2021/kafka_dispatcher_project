package com.reyzis.common.message;

import com.reyzis.common.bean.Route;
import com.reyzis.common.bean.Source;
import com.reyzis.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeRouteMessage extends Message {

    private Route route;

    public OfficeRouteMessage() {
        this.source = Source.BOARD;
        this.type = Type.ROUTE;
    }

    public OfficeRouteMessage(Route route) {
        this();
        this.route = route;
    }
}
