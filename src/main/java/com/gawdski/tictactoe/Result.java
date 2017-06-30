package com.gawdski.tictactoe;

public class Result {
    public boolean gameWon(Board board) {
        if(board.takenTiles() < 3) return false;
        return true;
    }
}
