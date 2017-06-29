package com.gawdski.tictactoe;

public enum Symbol {
    X, O, EMPTY;

    public static Symbol getSymbol(String symbol) {
        if(symbol.equalsIgnoreCase("x")) return X;
        if(symbol.equalsIgnoreCase("o")) return O;
        return EMPTY;
    }
}
