package patternPrinting.basicPatterns;

import java.util.Scanner;

public class ZeroAndOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//             if(i%2==1){
//              if(j%2==1){
//                  System.out.print(1+" ");
//              }else System.out.print(0+" ");
//             }else {
//                 if(j%2==0){
//                     System.out.print(1+" ");
//                 }else System.out.print(0+" ");
//             }
//
//            }
//            System.out.println();
//        }



        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}

