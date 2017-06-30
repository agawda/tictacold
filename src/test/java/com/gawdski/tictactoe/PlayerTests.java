package com.gawdski.tictactoe;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlayerTests {
    @Test
    public void assignPlayerNameCorrectlyTest() {
        Player player = new Player("Robert");
        assertEquals(player.getName(), "Robert");
    }

    @Test
    public void assignPlayerSymbolCorrectly() {
        Player player = new Player(Symbol.X);
        assertEquals(player.getSymbol(), Symbol.X);
    }
}
