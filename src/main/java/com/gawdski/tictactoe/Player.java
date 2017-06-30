package com.gawdski.tictactoe;

public class Player {
    private String name;
    private Symbol symbol;

    Player(String name) {
        this.name = name;
    }

    Player(Symbol symbol) {
        this.symbol = symbol;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
