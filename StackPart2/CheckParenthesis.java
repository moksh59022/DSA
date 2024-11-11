package StackPart2;

import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Stack<Character> st = new Stack<>();

        // Edge case for string of length 1
        if (n == 1) {
            System.out.println("false");
        } else {
            boolean isBalanced = true; // Flag to track if the string is balanced

            for (int i = 0; i < n; i++) {
                char current = s.charAt(i);

                if (current == '(' || current == '{' || current == '[') {
                    st.push(current);  // Push opening brackets
                } else {
                    // If closing bracket appears but the stack is empty
                    if (st.isEmpty()) {
                        isBalanced = false;
                        break;
                    }

                    char top = st.peek();
                    if ((top == '(' && current == ')') ||
                            (top == '{' && current == '}') ||
                            (top == '[' && current == ']')) {
                        st.pop(); // Pop matching pair
                    } else {
                        isBalanced = false; // Mismatch found
                        break;
                    }
                }
            }

            // After loop check if stack is empty (all opened brackets matched)
            if (!st.isEmpty()) {
                isBalanced = false;
            }

            // Print final result once
            System.out.println(isBalanced);
        }
    }
}
