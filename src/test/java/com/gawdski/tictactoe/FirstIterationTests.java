package com.gawdski.tictactoe;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

@Test
public class FirstIterationTests {
    @Test
    public void testBoardInitialization() {
        Board board = new Board();
        Map<Integer, Symbol> boardLayout = board.getBoardLayout();
        Map<Integer, Symbol> expected = getEmptyBoard();
        assertEquals(boardLayout, expected);
    }

    @Test
    public void testUserInputStored() {
        Board board = new Board();
        board.move(1, "X");
        board.move(3, "X");
        Map<Integer, Symbol> boardLayout = board.getBoardLayout();

        Map<Integer, Symbol> expected = getEmptyBoard();
        expected.put(1, Symbol.X);
        expected.put(3, Symbol.X);
        assertEquals(boardLayout, expected);
    }

    @Test
    public void testOverwritingTile() {
        Board board = new Board();
        board.move(1, "X");
        board.move(1, "O");
        Map<Integer, Symbol> boardLayout = board.getBoardLayout();

        Map<Integer, Symbol> expected = getEmptyBoard();
        expected.put(1, Symbol.X);
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
        assertFalse(board.isGameFinished());

        board.move(3, "O");
        assertFalse(board.isGameFinished());
        board.move(5, "X");
        assertFalse(board.isGameFinished());
        board.move(8, "X");
        assertTrue(board.isGameFinished());
    }

    @Test
    public void anotherWinningTest() {
        Board board = new Board();
        board.move(3, "O");
        board.move(5, "O");
        board.move(7, "O");
        assertTrue(board.isGameFinished());
    }

    Map<Integer, Symbol> getEmptyBoard() {
        Map<Integer, Symbol> expected = new HashMap<>();
        for(int i = 1; i <= 9; i++) {
            expected.put(i, Symbol.EMPTY);
        }
        return expected;
    }

}
