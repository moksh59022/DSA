package Recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void ZigZag(int n){
        if(n==0) return;
        System.out.print(n);
        ZigZag(n-1);
        System.out.print(n);
        ZigZag(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ZigZag(n);
    }
}
