package Brown;

import java.util.Scanner;
import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        String post = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for (int i = 0; i < post.length(); i++) {
            char ch = post.charAt(i);
            int asccii = (int) ch;
            if(asccii>=48 && asccii<=57) st.push(ch+"");
            else {
                 String val2 = st.pop();
                 String val1 = st.pop();
                 char op = ch;
                 st.push(op+val1+val2);
            }
        }
        System.out.println(st.peek());

    }
}
