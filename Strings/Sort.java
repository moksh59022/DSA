package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }
        }
}
