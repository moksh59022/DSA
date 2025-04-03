package Brown;



import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
        public static void main(String[] args) {
        String infix = "(4+2)*(7-4)";
        System.out.println("Infix: " + infix);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If it's a digit (handle multi-digit numbers)
            if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    num.append(infix.charAt(i));
                    i++;
                }
                i--; // Adjust index after loop
                val.push(num.toString());
            }
            // If it's an opening bracket or operator stack is empty
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // Remove '('
            }
            // If it's an operator
            else {
                // Handle precedence for '+' and '-'
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && op.peek() != '(') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                }
                // Handle precedence for '*' and '/'
                if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }

        // Handle remaining operators
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        // Final result
        String prefix = val.pop();
        System.out.println("Prefix: " + prefix); // Output: +10*52
    }
}

