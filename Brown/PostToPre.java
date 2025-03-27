package Brown;

import java.util.Scanner;
import java.util.Stack;

public class PostToPre {
        public static void main(String[] args) {
            String str = "9 5 3 + 4 * 6 / -"; // - 9 (/ (* (+ 5 3) 4) 6)

            System.out.println(postfixToPrefix(str));
        }
        public static String postfixToPrefix(String str) {
            Stack<String> val = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Skip spaces
                if (ch == ' ') continue;

                // If it's a digit, process the number (handle multi-digit numbers)
                if (Character.isDigit(ch)) {
                    StringBuilder num = new StringBuilder();
                    while (i < str.length() && Character.isDigit(str.charAt(i))) {
                        num.append(str.charAt(i));
                        i++;
                    }
                    i--;  // Adjust index after loop
                    val.push(num.toString());
                }
                // If it's an operator, pop two values and form an infix expression
                else {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    val.push("(" + ch+" "+ v1 + " " + v2 + ")");
                }
            }
            return val.pop();
        }
}
