package HashMapAndHeaps;

import java.util.*;

public class ComparableExample {

        static class Student implements Comparable<Student> {
            int rno;
            int ht;
            int wt;

            Student(int rno, int ht, int wt) {
                this.rno = rno;
                this.ht = ht;
                this.wt = wt;
            }

            // Compare students in descending order of roll number
            public int compareTo(Student o) {
                return o.rno - this.rno;
            }

            public String toString() {
                return "Rno = " + this.rno + ", Ht = " + this.ht + ", Wt = " + this.wt;
            }
        }

        public static void main(String[] args) throws Exception {
            int[] arr = {10, 2, 17, 3, 18, 9, 22};

            PriorityQueue<Student> pq = new PriorityQueue<>();
            pq.add(new Student(10, 180, 81));
            pq.add(new Student(2, 185, 85));
            pq.add(new Student(12, 170, 84));
            pq.add(new Student(18, 179, 88));
            pq.add(new Student(7, 182, 82));
            pq.add(new Student(17, 180, 81));

            while (!pq.isEmpty()) {
                System.out.println(pq.remove());
            }
        }


}
