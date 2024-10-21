package Recursion;

import java.util.Scanner;

public class PrintNTo1 {
//    public static void print(int x,int n){      // using two parameters
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }

    public static int n;         // using global variable
    public static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
//        print(1,n);
        print(1);
    }
}
