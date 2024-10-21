package patternPrinting.compositePatterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(j+" ");
            }


            System.out.println();
        }

        //Method 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst =1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }


    }
}
