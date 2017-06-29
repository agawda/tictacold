package com.gawdski.tictactoe;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class AppTest {
    @Test
    public void testBoardInitialization() {
        Board board = new Board();
        Map<Integer, String> boardLayout = board.getBoardLayout();
        Map<Integer, String> expected = getEmptyBoard();
        assertEquals(boardLayout, expected);
    }

    @Test
    public void testUserInputStored() {
        Board board = new Board();
        board.move(1, "X");
        board.move(3, "X");
        Map<Integer, String> boardLayout = board.getBoardLayout();

        Map<Integer, String> expected = getEmptyBoard();
        expected.put(1, "X");
        expected.put(3, "X");
        assertEquals(boardLayout, expected);
    }

    @Test
    public void testOverwritingTile() {
        Board board = new Board();
        board.move(1, "X");
        board.move(1, "O");
        Map<Integer, String> boardLayout = board.getBoardLayout();

        Map<Integer, String> expected = getEmptyBoard();
        expected.put(1, "X");
        assertEquals(boardLayout, expected);
    }

    @Test
    public void changeSymbolsTest() {
        Board board = new Board();
        assertEquals(board.getCurrentPlayer(), "X");
        board.move(1, "X");
        assertEquals(board.getCurrentPlayer(), "O");
        board.move(1, "X");
        assertEquals(board.getCurrentPlayer(), "O");
    }

    @Test
    public void winningConditionTest() {
        Board board = new Board();
        board.move(1, "X");
        board.move(2, "X");
        board.move(3, "X");
        assertTrue(board.isGameFinished());
    }

    Map<Integer, String> getEmptyBoard() {
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
        return expected;
    }

}
