package com.gawdski.tictactoe;

public class Result {
    public boolean gameWon(Board board) {
        //TODO: implement an actual algorithm
        //TODO: remove magic numbers ;_;
        //TODO: extract methods
        if (board.takenTiles() < 3) return false;

        //TODO: check horizontally, refactor later
        //initial i = 1, while i % 3 != 0
        Symbol winningSymbol;
        for (int i = 1; i <= 9; i += 3) {
            winningSymbol = board.getTile(i);
            if (!winningSymbol.equals(Symbol.EMPTY)) {
                int j = i;
                for (int k = i + 1; k < i + 3; k++) {
                    if (board.getTile(k).equals(winningSymbol)) j++;
                    else j--;
                }
                if (j == i + 2) return true;
            }
        }
        //TODO: check vertically
        for (int i = 1; i <= 3; i++) {
            winningSymbol = board.getTile(i);
            if (!winningSymbol.equals(Symbol.EMPTY)) {
                int j = i;
                for (int k = i + 3; k <= i + 6; k += 3) {
                    if (board.getTile(k).equals(winningSymbol)) j += 3;
                    else j -= 3;
                }
                if (j == i + 6) return true;
            }
        }
        //TODO: check diagonally
        winningSymbol = board.getTile(1);
        if(!winningSymbol.equals(Symbol.EMPTY)) {
            for (int i = 1; i <= 9; i += 4) {
                if (!board.getTile(i).equals(winningSymbol)) break;
                if(i == 9) return true;
            }
        }

        winningSymbol = board.getTile(3);
        if(!winningSymbol.equals(Symbol.EMPTY)) {
            for (int i = 3; i <= 7; i+=2) {
                if(!board.getTile(i).equals(winningSymbol)) break;
                if(i == 7) return true;
            }
        }
        return false;
    }
}
