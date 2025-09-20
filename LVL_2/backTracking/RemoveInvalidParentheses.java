package LVL_2.backTracking;

import java.util.HashSet;
import java.util.Stack;

public class RemoveInvalidParentheses {

    public static void sol(String str, int minRemoval, HashSet<String> ans, HashSet<String> visited) {
        if (visited.contains(str)) return; // avoid recomputation
        visited.add(str);

        if (minRemoval == 0) {
            int minRemovalNow = getMin(str);
            if (minRemovalNow == 0) {
                if (!ans.contains(str)) {
                    System.out.println(str);
                    ans.add(str);
                }
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            sol(left + right, minRemoval - 1, ans, visited);
        }
    }

    public static int getMin(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    st.push(ch);
                } else if (st.peek() == ')') {
                    st.push(ch);
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        String s = "()())"; // Example
        int minRemoval = getMin(s);
        HashSet<String> ans = new HashSet<>();
        HashSet<String> visited = new HashSet<>();
        sol(s, minRemoval, ans, visited);
    }
}
