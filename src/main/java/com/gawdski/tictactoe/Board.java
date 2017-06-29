package com.gawdski.tictactoe;

import java.util.HashMap;
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
        for(int i = 1; i <= 9; i++) {
            board.put(i, " ");
        }
    }

    public void printBoard() {
        board.forEach((k, v) -> {
            System.out.printf("|%s", v);
            if(k % 3 == 0) {
                System.out.print("|");
                System.out.println();
            }
        });
    }
}
