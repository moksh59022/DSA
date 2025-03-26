package StackPart3;

import java.util.Stack;

public class PostToIn {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        String str2 = "9 5 3 + 4 * 6 / -";

        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t =  "("+v1+op+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
        System.out.println(postfixToInfix(str2));
    }

        public static String postfixToInfix(String str) {
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
                    val.push("(" + v1 + " " + ch + " " + v2 + ")");
                }
            }
            return val.pop();
        }
    }


