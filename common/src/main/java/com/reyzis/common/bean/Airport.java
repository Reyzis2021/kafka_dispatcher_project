package com.reyzis.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@EqualsAndHashCode
public class Airport {

    private String name;
    private final List<String> boards = new ArrayList<>();
    private int x;
    private int y;

    private void addBoard(String boardName) {
        Optional.ofNullable(boardName)
                .map(boards::indexOf)
                .ifPresentOrElse(
                        index -> {
                            if (index >= 0) {
                                boards.set(index, boardName);
                            } else {
                                boards.add(boardName);
                            }
                        },
                        () -> {
                            throw new NullPointerException(
                                    String.format("Failed add board operation, because board name = %s.", boardName));
                        });
    }

    private void removeBoard(String boardName) {
        Optional.ofNullable(boardName)
                .ifPresentOrElse(
                        board -> boards.remove(boardName),
                        () -> {
                            throw new NullPointerException(
                                    String.format("Failed remove board operation, because board name = %s.", boardName));
                        });
    }
}
