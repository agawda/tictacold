package com.gawdski.tictactoe;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;


public class AppTest {
    @Test
    public void testBoardInitialization() {
        Board board = new Board();
        Map<Integer, String> boardLayout = board.getBoardLayout();
        Map<Integer, String> expected = new HashMap<>();
        expected.put(1, " ");
        expected.put(2, " ");
        expected.put(3, " ");
        expected.put(4, " ");
        expected.put(5, " ");
        expected.put(6, " ");
        expected.put(7, " ");
        expected.put(8, " ");
        expected.put(9, " ");
        assertEquals(boardLayout, expected);
    }
}
