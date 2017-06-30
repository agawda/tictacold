package com.gawdski.tictactoe;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

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

    @Test
    public void convertSymbolToStringTest() {
        String x = Symbol.getString(Symbol.X);
        String o = Symbol.getString(Symbol.O);
        String empty = Symbol.getString(Symbol.EMPTY);
        assertEquals(x, "X");
        assertEquals(o, "O");
        assertEquals(empty, " ");
    }

    @Test
    public void symbolsAddTest() {
        Tiles tiles = new Tiles();
        tiles.add(1, "X");
        tiles.add(2, "X");

        Map<Integer, Symbol> expected = getEmptyBoard();
        expected.put(1, Symbol.X);
        expected.put(2, Symbol.X);
        assertEquals(tiles.getBoardLayout(), expected);
    }

    @Test
    public void symbolsOverwritingFieldsTest() {
        Tiles tiles = new Tiles();
        tiles.add(1, "X");
        tiles.add(1, "O");

        Map<Integer, Symbol> expected = getEmptyBoard();
        expected.put(1, Symbol.X);
        assertEquals(tiles.getBoardLayout(), expected);
    }

    @DataProvider(name = "dataOneTileTest")
    public Object[][] dataOneTileTest() {
        Tiles tiles = new Tiles();
        tiles.add(1, "X");
        tiles.add(1, "O");
        return new Object[][] {
                {tiles.getTile(1), Symbol.X}
        };
    }

    @Test(dataProvider = "dataOneTileTest")
    public void getOneTileTest(Symbol actual, Symbol expected) {
        assertEquals(actual, expected);
    }

    @Test
    public void getTakenTilesNumber() {
        Tiles tiles = new Tiles();
        tiles.add(1, "X");
        tiles.add(2, "X");
        assertEquals(tiles.takenTilesNumber(), 2);
    }

    Map<Integer, Symbol> getEmptyBoard() {
        Map<Integer, Symbol> expected = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            expected.put(i, Symbol.EMPTY);
        }
        return expected;
    }
}
