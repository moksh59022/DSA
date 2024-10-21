package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSets {
   static ArrayList<String> arr = new ArrayList<>(); // global
    public static void subset(int i,String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);

        subset(i+1,s,ans);  // not take
        subset(i+1,s,ans+ch);   // take

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        arr = new ArrayList<>();   // reset global for leetcode,
        subset(0,s,"");
        System.out.print(arr);

    }
}
