package patternPrinting.A2Z;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
//        for(int i = n;i>=1;i--){
//            for (int j = n-i; j >0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 2*i-1; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
