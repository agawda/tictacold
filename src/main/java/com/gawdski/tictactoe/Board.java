package com.gawdski.tictactoe;

import java.util.HashMap;
import java.util.Map;

class Board {
    private Symbols symbols;
    private String currentPlayer;


    public Board() {
        this.currentPlayer = "X";
        createEmptyBoard();
    }

    //TODO: prepare a String ready to print with this method instead
    Map<Integer, Symbol> getBoardLayout() {
        return symbols.getBoardLayout();
    }

    void move(int tile, String symbol) {
        if (symbols.getTile(tile).equals(Symbol.EMPTY)) {
            symbols.add(tile, symbol);
//            swapPlayers();
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
        //TODO: probably this method will be deleted completely very soon
        if (symbols.takenTilesNumber() < 3)
            return false;
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

    private void createEmptyBoard() {
        symbols = new Symbols();
    }

    public long takenTiles() {
        return symbols.takenTilesNumber();
    }

    public Symbols getSymbols() {
        //TODO: temporary method used in Result, need to refactor that
        return symbols;
    }

    public void printBoard() {
        symbols.getBoardLayout().forEach((k, v) -> {
            System.out.printf("|%s", Symbol.getString(v));
            if(k % 3 == 0) {
                System.out.print("|");
                System.out.println();
            }
        });
    }
}
