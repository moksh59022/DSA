package TwoDimensionalArray;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {


        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        int m = arr.length;   // no of rows
        int n = arr[0].length;  // no of columns

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}
