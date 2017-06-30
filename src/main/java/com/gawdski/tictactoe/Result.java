package com.gawdski.tictactoe;

public class Result {
    public boolean gameWon(Board board) {
        //TODO: implement an actual algorithm
        if(board.takenTiles() < 3) return false;
        Symbols symbols = board.getSymbols();
        Symbol winningSymbol = symbols.getTile(1);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (symbols.getTile(5).equals(winningSymbol)) {
                if (symbols.getTile(9).equals(winningSymbol)) {
                    return true;
                }
            }
            if(symbols.getTile(2).equals(winningSymbol)) {
                if(symbols.getTile(3).equals(winningSymbol)) return true;
            }
            if(symbols.getTile(4).equals(winningSymbol)) {
                if(symbols.getTile(7).equals(winningSymbol)) return true;
            }
        }
        winningSymbol = symbols.getTile(2);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (symbols.getTile(5).equals(winningSymbol)) {
                if (symbols.getTile(8).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = symbols.getTile(3);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (symbols.getTile(5).equals(winningSymbol)) {
                if (symbols.getTile(7).equals(winningSymbol)) return true;
            }
            if (symbols.getTile(6).equals(winningSymbol)) {
                if (symbols.getTile(9).equals(winningSymbol)) return true;
            }
        }


        winningSymbol = symbols.getTile(4);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (symbols.getTile(5).equals(winningSymbol)) {
                if (symbols.getTile(7).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = symbols.getTile(7);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (symbols.getTile(8).equals(winningSymbol)) {
                if (symbols.getTile(9).equals(winningSymbol)) return true;
            }
        }
        return false;
    }
}
