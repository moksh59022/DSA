package StackPart2;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {// ch==')'
                if (st.size() == 0) return false;
                if (st.peek() == '(')  st.pop();

            }

        }
        if (st.size() > 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));

    }
}
