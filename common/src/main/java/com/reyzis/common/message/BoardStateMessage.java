package com.reyzis.common.message;

import com.reyzis.common.bean.Board;
import com.reyzis.common.bean.Source;
import com.reyzis.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardStateMessage extends Message {

    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board board) {
        this();
        this.board = board;
    }
}
