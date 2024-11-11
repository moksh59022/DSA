package StackPart2;

import java.util.Scanner;
import java.util.Stack;

public class MinNoOfMoves {
    public static int MinBrackets(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(ch);
            } else if(ch==')') {
                if (!st.isEmpty() && st.peek()=='(') {
                    st.pop();

                }
                else{
                    st.push(ch);
                }
            }

        }
         int open=0;
        int close = 0;
        while(!st.isEmpty()){
            if (st.pop()=='('){
                open++;
            }
            else {
                close++;
            }

        }
        return close+open;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(MinBrackets(s));

    }

}
