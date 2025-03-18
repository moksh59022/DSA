package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);

        PriorityQueue<Integer> pt = new PriorityQueue<>(Collections.reverseOrder());
        pt.add(2);
        System.out.println(pt);
        pt.add(10);
        System.out.println(pt);
        pt.add(1);
        System.out.println(pt);
        pt.remove();
        System.out.println(pt);
        pt.add(0);
        System.out.println(pt);
    }
}
