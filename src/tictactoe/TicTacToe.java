package tictactoe;

import java.util.Random;

public class TicTacToe {

    static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void displayBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[] performToss() {
        Random random = new Random();
        int tossResult = random.nextInt(2);
        char[] symbols = new char[2];
        if (tossResult == 0) {
            symbols[0] = 'X';
            symbols[1] = 'O';
            System.out.println("Player 1 wins the toss and plays as X");
            System.out.println("Player 2 plays as O");
        } else {
            symbols[0] = 'O';
            symbols[1] = 'X';
            System.out.println("Player 2 wins the toss and plays as X");
            System.out.println("Player 1 plays as O");
        }
        return symbols;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        displayBoard(board);
        char[] symbols = performToss();
    }
}