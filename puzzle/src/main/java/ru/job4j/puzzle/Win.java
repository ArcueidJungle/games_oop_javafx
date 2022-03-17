package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < 4; i++) {
            if (horizontal(board, i) || (vertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < 5; j++) {
            if (board[row][j] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
