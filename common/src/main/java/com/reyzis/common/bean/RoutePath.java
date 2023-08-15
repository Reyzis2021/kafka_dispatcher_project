package com.reyzis.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class RoutePath {

    private RoutePath from;
    private RoutePath to;
    private double progress;

    private static final Integer COMPLETED = 100;

    public void addProgress(double speed) {
        progress += speed;
        if (progress > COMPLETED) {
            progress = COMPLETED;
        }
    }

    public boolean done() {
        return progress == COMPLETED;
    }

}
