package com.gawdski.tictactoe;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Please choose the starting symbol (X or O): ");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        System.out.println(symbol);
    }
}
