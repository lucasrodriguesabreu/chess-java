package com.lucas.chess.pieces;

import com.lucas.boardgame.Board;
import com.lucas.chess.ChessPiece;
import com.lucas.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
