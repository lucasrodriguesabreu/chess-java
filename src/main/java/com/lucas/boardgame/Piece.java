package com.lucas.boardgame;

public class Piece {

    protected Position position;
    private Board board;
    public Piece possibleMoves;
    public boolean possibleMove;
    public boolean isThereAnyPossibleMove;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
