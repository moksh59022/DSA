package LVL_2.backTracking;

public class QueensCombinationPartTwo {
    public static void queens(int qpsf, int tq, boolean[][] chess, int i, int j) {
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    System.out.print(chess[row][col] ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // Place in the same row
        for (int col = j + 1; col < chess.length; col++) {
            chess[i][col] = true;
            queens(qpsf + 1, tq, chess, i, col);
            chess[i][col] = false;
        }

        // Place in next rows
        for (int row = i + 1; row < chess.length; row++) {
            for (int col = 0; col < chess.length; col++) {
                chess[row][col] = true;
                queens(qpsf + 1, tq, chess, row, col);
                chess[row][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[][] chess = new boolean[n][n];
        queens(0, tq, chess, 0, -1);
    }
}
