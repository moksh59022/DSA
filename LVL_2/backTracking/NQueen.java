package LVL_2.backTracking;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] board = new boolean[n][n];
        boolean[] col = new boolean[n];
        boolean[] ndiag = new boolean[2 * n - 1];
        boolean[] rdiag = new boolean[2 * n - 1];

        solve(board, 0, col, ndiag, rdiag, "");
    }

    private static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag, String asf) {
        if (row == board.length) {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (!cols[col] && !ndiag[row + col] && !rdiag[row - col + board.length - 1]) {
                // Place queen
                board[row][col] = true;
                cols[col] = true;
                ndiag[row + col] = true;
                rdiag[row - col + board.length - 1] = true;

                // Recurse
                solve(board, row + 1, cols, ndiag, rdiag, asf + row + "-" + col + ", ");

                // Backtrack (undo placement)
                board[row][col] = false;
                cols[col] = false;
                ndiag[row + col] = false;
                rdiag[row - col + board.length - 1] = false;
            }
        }
    }
}
