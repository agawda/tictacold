package com.gawdski.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class Symbols {
    private Map<Integer, Symbol> symbols;

    public Symbols() {
        symbols = new HashMap<>();
        for(int i = 1; i <= 9; i++) {
            symbols.put(i, Symbol.EMPTY);
        }
    }

    public void add(int tile, String symbol) {
        if (symbols.get(tile).equals(Symbol.EMPTY)) {
            symbols.put(tile, Symbol.getSymbol(symbol));
        }
    }

    public Symbol getTile(int tile) {
        //TODO: should throw an exception if the tile is invalid
        return symbols.get(tile);
    }

    public Map<Integer, Symbol> getBoardLayout() {
        return symbols;
    }
}
