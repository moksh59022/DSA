package Strings;

import java.util.Scanner;

public class RemoveBandAC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = ""; // Initialize an empty result string

        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'b') {
                // Skip 'b'
                i++;
            } else if (s.charAt(i) == 'a' && i + 1 < s.length() && s.charAt(i + 1) == 'c') {
                // Skip both 'a' and 'c'
                i += 2;
            } else {
                // Append the current character to the result
                result += s.charAt(i);
                i++;
            }
        }

        System.out.print(result);
        sc.close(); // Close the scanner
    }
}
