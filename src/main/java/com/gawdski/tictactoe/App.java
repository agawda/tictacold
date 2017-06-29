package com.gawdski.tictactoe;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        while(!board.isGameFinished()) {
            board.printBoard();
            System.out.println("Tile number: ");
            int move = Integer.parseInt(scanner.nextLine());
            System.out.println(move);
            System.out.println("Symbol: ");
            String symbol = scanner.nextLine();
            board.move(move, symbol);
        }
        board.printBoard();
    }
}
