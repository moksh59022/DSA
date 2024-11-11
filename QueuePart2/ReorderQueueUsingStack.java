package QueuePart2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q  = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n/2 ; i++) {
            st.push(q.remove());
        } // 5 6 7 8            top 4 3 2 1

        while (st.size()>0){
            q.add(st.pop());
        } // 5 6 7 8 4 3 2 1

        for (int i = 1; i <= n/2; i++) {
            st.push(q.remove());
        } // 4 3 2 1              top 8 7 6 5

       while (st.size()>0){
            // one by one , pehle stack se fir queue se
            q.add(st.pop());
            q.add(q.remove());
        }
          //  8 4 7 3 6 2 5 1

        // reverse the queue

        while (q.size()>0){
            st.push(q.remove());
        }

        while (st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);


    }


}
