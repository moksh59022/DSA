package Strings;

import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.nextLine();
         int index = s.indexOf(word);
         if(index!=-1){
             s=s.substring(0,index)+s.substring(index+word.length());
         }
        System.out.println(s);




    }
}
