package com.reyzis.common.bean;

import lombok.EqualsAndHashCode;
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

    private static final int FULL_TURN_ANGLE = 360;

    private boolean noBusy() {
        return !busy;
    }

    private void calculatePosition(RoutePath routeDirection) {
        double t = routeDirection.getProgress() / 100;
        double toX = interpolate(routeDirection.getFrom().getX(), routeDirection.getTo().getX(), t);
        double toY = interpolate(routeDirection.getFrom().getY(), routeDirection.getTo().getY(), t);

        double deltaX = this.x - toX;
        double deltaY = this.y - toY;

        this.angle = Math.toDegrees(Math.atan2(deltaY, deltaX));
        this.angle = (this.angle < 0) ? FULL_TURN_ANGLE + this.angle : this.angle;

        this.x = toX;
        this.y = toY;
    }

    private double interpolate(double from, double to, double t) {
        return (1 - t) * from + t * to;
    }
}
