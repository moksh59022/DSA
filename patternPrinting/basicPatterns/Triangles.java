package patternPrinting.basicPatterns;

public class Triangles {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
               if(i%2==0) System.out.print((char)(j+64)+" ");
               else System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();




    }
}
