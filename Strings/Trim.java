package Strings;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        int i = 0, j = s.length() - 1;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        while (j > 0 && s.charAt(j) == ' ') {
            j--;
        }
        for (int x = i; x <= j; x++) {
            ans = ans + s.charAt(x);
        }
        System.out.print(ans);
    }
}
