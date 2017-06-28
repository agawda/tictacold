package com.gawdski.tictactoe;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Please choose the starting symbol (X or O): ");
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();
        System.out.println(symbol);

        int x;
        int y;

        System.out.println("Please enter board dimensions: ");
        System.out.println("x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("y: ");
        y = Integer.parseInt(scanner.nextLine());

        System.out.println(x + " " + y);

//        for(int i = 0; i < 3; i++) {
//
//        }
    }
}
