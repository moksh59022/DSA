package patternPrinting.basicPatterns;

import java.util.Scanner;

public class AlphabetPrinting {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            for (int j = 0; j < 10; j++) {
                System.out.print((char) (i+97)+" ");

            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
    }
}
