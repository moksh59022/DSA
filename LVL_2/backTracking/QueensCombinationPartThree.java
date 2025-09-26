package LVL_2.backTracking;

public class QueensCombinationPartThree {
    public static void queens(int qpsf,int tq,boolean[][] chess,int lcno){
        if (qpsf == tq){
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    if (chess[row][col]){
                        System.out.print("q\t");
                    } else {
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int cell = lcno + 1; cell < chess.length * chess.length; cell++) {
            int row = cell / chess.length;
            int col = cell % chess.length;

            chess[row][col] = true;
            queens(qpsf + 1, tq, chess, cell);
            chess[row][col] = false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[][] chess = new boolean[n][n];
        queens(0, tq, chess, -1);
    }
}
