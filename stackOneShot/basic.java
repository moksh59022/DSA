package stackOneShot;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);

        // peek
        System.out.println(st.peek());
        // size
        System.out.println(st.size());

        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st.isEmpty());


    }
}
