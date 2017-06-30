package com.gawdski.tictactoe;

import java.util.Map;

class Board {
    private Tiles tiles;
    private String currentPlayer;


    public Board() {
        this.currentPlayer = "X";
        createEmptyBoard();
    }

    //TODO: prepare a String ready to print with this method instead
    Map<Integer, Symbol> getBoardLayout() {
        return tiles.getBoardLayout();
    }

    void move(int tile, String symbol) {
        if (tiles.getTile(tile).equals(Symbol.EMPTY)) {
            tiles.add(tile, symbol);
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
        if (tiles.takenTilesNumber() < 3)
            return false;
        Symbol winningSymbol = tiles.getTile(1);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (tiles.getTile(5).equals(winningSymbol)) {
                if (tiles.getTile(9).equals(winningSymbol)) {
                    return true;
                }
            }
            if(tiles.getTile(2).equals(winningSymbol)) {
                if(tiles.getTile(3).equals(winningSymbol)) return true;
            }
            if(tiles.getTile(4).equals(winningSymbol)) {
                if(tiles.getTile(7).equals(winningSymbol)) return true;
            }
        }
        winningSymbol = tiles.getTile(2);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (tiles.getTile(5).equals(winningSymbol)) {
                if (tiles.getTile(8).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = tiles.getTile(3);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (tiles.getTile(5).equals(winningSymbol)) {
                if (tiles.getTile(7).equals(winningSymbol)) return true;
            }
            if (tiles.getTile(6).equals(winningSymbol)) {
                if (tiles.getTile(9).equals(winningSymbol)) return true;
            }
        }


        winningSymbol = tiles.getTile(4);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (tiles.getTile(5).equals(winningSymbol)) {
                if (tiles.getTile(7).equals(winningSymbol)) return true;
            }
        }

        winningSymbol = tiles.getTile(7);
        if (!winningSymbol.equals(Symbol.EMPTY)) {
            if (tiles.getTile(8).equals(winningSymbol)) {
                if (tiles.getTile(9).equals(winningSymbol)) return true;
            }
        }
        return false;
    }

    public void createEmptyBoard() {
        tiles = new Tiles();
    }

    public long takenTiles() {
        return tiles.takenTilesNumber();
    }

    public Tiles getTiles() {
        //TODO: temporary method used in Result, need to refactor that
        return tiles;
    }

    public Symbol getTile(int tile) {
        return tiles.getTile(tile);
    }

    public void printBoard() {
        tiles.getBoardLayout().forEach((k, v) -> {
            System.out.printf("|%s", Symbol.getString(v));
            if(k % 3 == 0) {
                System.out.print("|");
                System.out.println();
            }
        });
    }
}
