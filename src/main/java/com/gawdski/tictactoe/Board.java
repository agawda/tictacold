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
        if (board.get(tile).equals(" ")) {
            board.put(tile, symbol);
            swapPlayers();
        }
    }

    String getCurrentPlayer() {
        return currentPlayer;
    }

    private void swapPlayers() {
        if (this.currentPlayer.equals("X")) {
            this.currentPlayer = "O";
        } else {
            this.currentPlayer = "X";
        }
    }

    boolean isGameFinished() {
        if (size() < 3)
            return false;
        String winningSymbol = board.get(1);
        if (!winningSymbol.equals(" ")) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(9).equals(winningSymbol)) {
                    return true;
                }
            }
            if(board.get(2).equals(winningSymbol)) {
                if(board.get(3).equals(winningSymbol)) return true;
            }
            if(board.get(4).equals(winningSymbol)) {
                if(board.get(7).equals(winningSymbol)) return true;
            }
        }
        winningSymbol = board.get(2);
        if (!winningSymbol.equals(" ")) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(8).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = board.get(3);
        if (!winningSymbol.equals(" ")) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(7).equals(winningSymbol)) return true;
            }
            if (board.get(6).equals(winningSymbol)) {
                if (board.get(9).equals(winningSymbol)) return true;
            }
        }


        winningSymbol = board.get(4);
        if (!winningSymbol.equals(" ")) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(7).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = board.get(7);
        if (!winningSymbol.equals(" ")) {
            if (board.get(8).equals(winningSymbol)) {
                if (board.get(9).equals(winningSymbol)) return true;
            }
        }
        return false;
    }

    private long size() {
        return board.entrySet().stream().filter(x -> !x.getValue().equals(" ")).count();
    }

    private void createEmptyBoard() {
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
