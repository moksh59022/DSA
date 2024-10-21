package stackOneShot;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//        int n = sc.nextInt();
//        for(int i = 0;i<n;i++){
//            int x= sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // reverse order
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());

        }
        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
