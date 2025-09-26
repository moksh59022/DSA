package LVL_2.backTracking;

public class QueensCombinationPartTwo {
    public static void queens(int qpsf,int tq,boolean[][] chess,int i,int j){
        if (qpsf == tq){
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    if (chess[row][col] == true){
                        System.out.println("q\t");
                    }
                    else {
                        System.out.println("-\t");
                    }
                }
                System.out.println();
                return;
            }
        }
        for (int col = j+1; col < chess.length; col++) {
            chess[i][col] = true;
            queens(qpsf+1,tq,chess,i,col);
            chess[i][col] = false;
        }

        for (int row = i+1; row < chess.length; row++) {
            for (int col = 0; col < chess.length; col++) {
            chess[row][col] = true;
            queens(qpsf+1,tq,chess,i,col);
            chess[row][col] = false;

            }
        }
    }
    public static void main(String[] args) {

    }
}
