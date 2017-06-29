package com.gawdski.tictactoe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Board {
    private Map<Integer, String> board;
    private String currentPlayer;

    public Board() {
        this.currentPlayer = "X";
        createEmptyBoard();
    }

    Map<Integer, String> getBoardLayout() {
        return board;
    }

    void move(int tile, String symbol) {
        if(board.get(tile).equals(" ")) {
            board.put(tile, symbol);
            swapPlayers();
        }
    }

    String getCurrentPlayer() {
        return currentPlayer;
    }

    private void swapPlayers() {
        if(this.currentPlayer.equals("X")) {
            this.currentPlayer = "O";
        } else {
            this.currentPlayer = "X";
        }
    }

    boolean isGameFinished() {
        if(size() < 3)
            return false;
        return true;
    }

    private long size() {
        int symbolCount = 0;
        return board.entrySet().stream().filter(x -> !x.getValue().equals(" ")).count();
    }

    void createEmptyBoard() {
        board = new HashMap<>();
        board.put(1, " ");
        board.put(2, " ");
        board.put(3, " ");
        board.put(4, " ");
        board.put(5, " ");
        board.put(6, " ");
        board.put(7, " ");
        board.put(8, " ");
        board.put(9, " ");
    }
}
