package patternPrinting.compositePatterns;

public class NoPyramidPalindrome {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
