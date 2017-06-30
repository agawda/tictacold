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
    }
}
