package com.gawdski.tictactoe;

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
}
