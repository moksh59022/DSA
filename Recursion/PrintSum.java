package Recursion;

import java.util.Scanner;

public class PrintSum {
public static void sum(int n,int s){
    if(n==0) {   // base case
        System.out.println(s);
        return;
    }
    sum(n-1,s+n);  // call and work

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);

    }
}
