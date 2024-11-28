package com.lucas.chess.pieces;

import com.lucas.boardgame.Board;
import com.lucas.chess.ChessPiece;
import com.lucas.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
