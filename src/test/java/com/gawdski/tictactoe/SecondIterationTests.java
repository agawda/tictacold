package com.gawdski.tictactoe;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondIterationTests {
    @Test
    public void createSymbolTest() {
        String x = "X";
        String o = "O";
        String empty = " ";
        Symbol sx = Symbol.getSymbol(x);
        Symbol so = Symbol.getSymbol(o);
        Symbol sEmpty = Symbol.getSymbol(empty);
        assertEquals(sx, Symbol.X);
        assertEquals(so, Symbol.O);
        assertEquals(sEmpty, Symbol.EMPTY);
    }
}
