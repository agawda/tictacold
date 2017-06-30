package com.gawdski.tictactoe;

import com.sun.org.apache.regexp.internal.RESyntaxException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThirdIterationTests {
    @Test
    public void getGameResultLessThanThreeMoves() {
        Result result = new Result();
        Board board = new Board();
        board.move(1, "X");
        board.move(2, "O");
        assertFalse(result.gameWon(board));
        board.move(4, "X");
        board.move(7, "X");
        assertTrue(result.gameWon(board));
    }

    @Test
    public void newAlgorithmHorizontalTest() {
        Result result = new Result();
        Board board = new Board();
        board.move(1, "X");
        board.move(2, "X");
        board.move(3, "X");
        assertTrue(result.gameWon(board));

        board.createEmptyBoard();
        board.move(4, "X");
        board.move(5, "X");
        board.move(6, "O");
        assertFalse(result.gameWon(board));

        board.createEmptyBoard();
        board.move(7, "O");
        board.move(8, "X");
        board.move(9, "X");
        assertFalse(result.gameWon(board), "horizontal not working");
    }

    @Test
    public void newAlgorithmVerticalTest() {
        Result result = new Result();
        Board board = new Board();
        board.move(1, "X");
        board.move(4, "X");
        board.move(7, "X");
        assertTrue(result.gameWon(board));

        board.createEmptyBoard();
        board.move(2, "X");
        board.move(5, "O");
        board.move(8, "X");
        assertFalse(result.gameWon(board));

        board.createEmptyBoard();
        board.move(1, "X");
        board.move(4, "X");
        board.move(7, "O");
        assertFalse(result.gameWon(board));
    }

    @Test
    public void newAlgorithmDiagonalTest() {
        Result result = new Result();
        Board board = new Board();
        board.move(1, "X");
        board.move(5, "X");
        board.move(9, "X");
        assertTrue(result.gameWon(board));

        board.createEmptyBoard();
        board.move(3, "X");
        board.move(5, "X");
        board.move(7, "X");
        assertTrue(result.gameWon(board));

        board.createEmptyBoard();
        board.move(1, "O");
        board.move(5, "X");
        board.move(9, "O");
        assertFalse(result.gameWon(board));
    }
}
