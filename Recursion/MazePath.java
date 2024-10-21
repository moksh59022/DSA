package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int maze(int i,int j ,int m,int n){
//        if(i==m||j==n) return 1;
        if(i==m||j==n) return 1;
        if(i>m||j>n) return 0;
        int rightWays = maze(i,j+1,m,n);
        int downWays = maze(i+1,j,m,n);
        return rightWays+downWays;
    }
    public static int maze2(int m,int n){
        if(m==1||n==1) return 1;
        int rightWays = maze2(m,n-1);
        int downWays = maze2(m-1,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
