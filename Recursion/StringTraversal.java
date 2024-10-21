package Recursion;

public class StringTraversal {
    public static void print(int n ,String s){
        if(n==s.length()) return;
        System.out.print(s.charAt(n));
        System.out.println();
        print(n+1,s);

    }
    public static void main(String[] args) {
        String s = "Moksh";
        print(0,s);
    }
}
