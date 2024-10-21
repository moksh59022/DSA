package patternPrinting.basicPatterns;

public class OddTriangle {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//              System.out.print(2*j-1+" ");
//
//            }
//            System.out.println();
//        }

         //int a =1;

        for (int i = 0; i < 10; i++) {
             int a =1;
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }


    }
}
