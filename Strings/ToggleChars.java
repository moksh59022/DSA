package Strings;

import java.util.Scanner;

public class ToggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){  // capital letter condition
                ascii+=32;
                ch = (char) ascii;
                s.setCharAt(i,ch);
            }
          else if(ascii>=97 && ascii<=122){
                ascii-=32;
                ch = (char) ascii;
                s.setCharAt(i,ch);
            }
        }
        System.out.println(s);

    }
}
