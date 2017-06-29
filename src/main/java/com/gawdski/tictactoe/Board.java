package com.gawdski.tictactoe;

import java.util.HashMap;
import java.util.Map;

class Board {
    private Map<Integer, Symbol> board;
    private String currentPlayer;


    public Board() {
        this.currentPlayer = "X";
        createEmptyBoard();
    }

    Map<Integer, Symbol> getBoardLayout() {
        return board;
    }

    void move(int tile, String symbol) {
        if (board.get(tile).equals(Symbol.EMPTY)) {
            board.put(tile, Symbol.getSymbol(symbol));
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
        Symbol winningSymbol = board.get(1);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
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
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(8).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = board.get(3);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(7).equals(winningSymbol)) return true;
            }
            if (board.get(6).equals(winningSymbol)) {
                if (board.get(9).equals(winningSymbol)) return true;
            }
        }


        winningSymbol = board.get(4);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (board.get(5).equals(winningSymbol)) {
                if (board.get(7).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = board.get(7);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (board.get(8).equals(winningSymbol)) {
                if (board.get(9).equals(winningSymbol)) return true;
            }
        }
        return false;
    }

    private long size() {
        return board.entrySet().stream().filter(x -> !x.getValue().equals(Symbol.EMPTY)).count();
    }

    private void createEmptyBoard() {
        board = new HashMap<>();
        for(int i = 1; i <= 9; i++) {
            board.put(i, Symbol.EMPTY);
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
