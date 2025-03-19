package StackPart3;

import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // If it's a digit
                val.push(ch + "");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = op + v1 + v2; // Form prefix expression
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
