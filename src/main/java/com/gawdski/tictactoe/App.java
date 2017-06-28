package com.gawdski.tictactoe;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
//        System.out.println("Please choose the starting symbol (X or O): ");
        Scanner scanner = new Scanner(System.in);

        String symbol = "x";
        System.out.println(symbol);

        int x;
        int y;

        System.out.println("Please enter board dimensions: ");
        System.out.println("x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("y: ");
        y = Integer.parseInt(scanner.nextLine());

        System.out.println(x + " " + y);

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                System.out.print("| ");
            }
            System.out.print("|");
            System.out.println();
        }

        String[][] board = new String[x][y];
        while(true) {
            System.out.println("Where to put your symbol?");
            System.out.println("x: ");
            int symbolX = Integer.parseInt(scanner.nextLine());
            System.out.println("y: ");
            int symbolY = Integer.parseInt(scanner.nextLine());
            board[symbolX][symbolY] = symbol;

            for (int i = 0; i < x; i++) {
                System.out.print("|");
                for (int j = 0; j < y; j++) {
                    System.out.print(board[i][j] + "|");
                }
                System.out.println();
            }
        }
    }
}
