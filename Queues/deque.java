package Queues;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
          // add, remove/poll , peek/element
        Deque<Integer> dq = new LinkedList<>();
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        dq.addLast(1);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());


        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.add(5);
//        dq.removeAll(dq); removes everything
//        dq.remove(); // first remove
//        dq.removeFirstOccurrence(1);
//        dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
}
