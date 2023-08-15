package com.reyzis.common.bean;

import lombok.EqufalsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Board {
    private String name;
    private String location;
    private Route route;
    private boolean busy;
    private double speed;
    private double x;
    private double y;
    private double angle;

    private boolean noBusy() {
        return !busy;
    }

    private void calculatePosition(RoutePath routeDirection) {
        double t = routeDirection.getProgress() / 100;
    }
}
