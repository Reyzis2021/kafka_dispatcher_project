package com.reyzis.common.bean;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class RoutePath {

    private RoutePoint from;
    private RoutePoint to;
    private double progress;

    private static final Integer DONE = 100;

    public void addProgress(double speed) {
        progress += speed;
        if (progress > DONE) {
            progress = DONE;
        }
    }

    public boolean done() {
        return progress == DONE;
    }

    public boolean inProgress() {
        return progress < DONE;
    }

}
