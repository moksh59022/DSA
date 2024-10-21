package stackOneShot;

import java.util.Stack;

public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.isEmpty()) return;;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);


    }
    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRec(st);
        System.out.println();
        displayRec(st);
        System.out.println();
        System.out.println(st);

//        System.out.println(st);
//    Stack<Integer> rt = new Stack<>();
//    while (st.size()>0){
//        rt.push(st.pop());
//    }
//    while (rt.size()>0){
//        int x  = rt.pop();
//        System.out.print(x+" ");
//        st.push(x);
//    }
//        System.out.println();
//        System.out.println(st);
//
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n-1; i >=0 ; i--) {
//            int x = st.pop();
//            arr[i]=x;
//        }
//        for (int i = 0; i < n; i++) {
//            int x = arr[i];
//            System.out.print(x+" ");
//            st.push(x);
//        }

    }
}
