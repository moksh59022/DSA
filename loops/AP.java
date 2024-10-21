package loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of terms : ");
        int n = sc.nextInt();
//        for (int i = 1; i <= 2*n-1; i+=2) {
//            System.out.println(i);
//        4,7,10,13.....
            int a = 4 , d = 3;
        for (int i = 1; i<=n; i++) {
            System.out.println(a);
            a+=d;
            
        }
    }
}
