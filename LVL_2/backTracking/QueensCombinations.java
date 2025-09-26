package LVL_2.backTracking;

import java.util.Scanner;

public class QueensCombinations {
    public static void sol(int qsf,int tq,int row,int col,String asf){
        if (row==tq){
            if(qsf==tq){
                System.out.println(asf);
            }
            return;
        }

        int nr =0 , nc = 0;
        String yasf = "" , nasf = "";
        if (col == tq-1){
            nr = row+1;
            nc = 0;
            yasf = asf + "q\n";
            nasf = asf + "-\n";
        }
        else {
            nr = row;
            nc = col+1;
            yasf = asf + "q";
            nasf = asf + "-";
        }

        sol(qsf+1,tq,nr,nc,yasf);
        sol(qsf,tq,nr,nc,nasf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sol(0,n,0,0,"");
    }
}
