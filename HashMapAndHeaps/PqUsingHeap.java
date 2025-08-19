package HashMapAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;

public class PqUsingHeap<T> {
    private ArrayList<T> data;
    private Comparator<T> comp;

    // Constructor for natural ordering (requires T implements Comparable)
    public PqUsingHeap() {
        this(null);
    }

    // Constructor for custom comparator
    public PqUsingHeap(Comparator<T> comp) {
        data = new ArrayList<>();
        this.comp = comp;
    }

    // Compare two indices using comparator if present, else Comparable
    @SuppressWarnings("unchecked")
    private boolean isSmaller(int i, int j) {
        T ith = data.get(i);
        T jth = data.get(j);

        if (comp != null) {
            return comp.compare(ith, jth) < 0;
        } else {
            return ((Comparable<T>) ith).compareTo(jth) < 0;
        }
    }

    public void add(T val) {
        data.add(val);
        upheapify(data.size() - 1);
    }

    private void upheapify(int i) {
        if (i == 0) return;
        int pi = (i - 1) / 2;
        if (isSmaller(i, pi)) {
            swap(i, pi);
            upheapify(pi);
        }
    }

    private void swap(int i, int j) {
        T ith = data.get(i);
        T jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
    }

    public T remove() {
        if (this.size() == 0) {
            System.out.println("Underflow");
            return null;
        }
        swap(0, data.size() - 1);
        T val = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            downheapify(0);
        }
        return val;
    }

    private void downheapify(int pi) {
        int mini = pi;
        int li = 2 * pi + 1;
        if (li < data.size() && isSmaller(li, mini)) {
            mini = li;
        }
        int ri = 2 * pi + 2;
        if (ri < data.size() && isSmaller(ri, mini)) {
            mini = ri;
        }
        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }
    }

    public T peek() {
        if (this.size() == 0) {
            System.out.println("Underflow");
            return null;
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    // Main for testing
    public static void main(String[] args) {
        // 1️⃣ Natural ordering with Comparable<Integer>
        PqUsingHeap<Integer> intHeap = new PqUsingHeap<>();
        intHeap.add(10);
        intHeap.add(5);
        intHeap.add(15);
        intHeap.add(3);

        System.out.println(intHeap.remove()); // 3
        System.out.println(intHeap.remove()); // 5
        System.out.println(intHeap.peek());   // 10
        System.out.println(intHeap.remove()); // 10
        System.out.println(intHeap.remove()); // 15

        // 2️⃣ Custom ordering with Comparator (max-heap)
        PqUsingHeap<Integer> maxHeap = new PqUsingHeap<>((a, b) -> b - a);
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(3);

        System.out.println(maxHeap.remove()); // 15
        System.out.println(maxHeap.remove()); // 10
        System.out.println(maxHeap.remove()); // 5
        System.out.println(maxHeap.remove()); // 3

        // 3️⃣ Custom class with Comparable
        PqUsingHeap<Student> studentHeap = new PqUsingHeap<>();
        studentHeap.add(new Student(10, 180, 81));
        studentHeap.add(new Student(2, 185, 85));
        studentHeap.add(new Student(12, 170, 84));

        System.out.println(studentHeap.remove());
        System.out.println(studentHeap.remove());
        System.out.println(studentHeap.remove());

        // 4️⃣ Custom class with Comparator (by height)
        PqUsingHeap<Student> heightHeap = new PqUsingHeap<>(
                (s1, s2) -> s1.ht - s2.ht
        );
        heightHeap.add(new Student(10, 180, 81));
        heightHeap.add(new Student(2, 185, 85));
        heightHeap.add(new Student(12, 170, 84));

        System.out.println(heightHeap.remove());
        System.out.println(heightHeap.remove());
        System.out.println(heightHeap.remove());
    }
}

// Example Student class
class Student implements Comparable<Student> {
    int rno;
    int ht;
    int wt;

    Student(int rno, int ht, int wt) {
        this.rno = rno;
        this.ht = ht;
        this.wt = wt;
    }

    // Compare by roll number
    public int compareTo(Student o) {
        return this.rno - o.rno;
    }

    public String toString() {
        return "Rno = " + rno + ", Ht = " + ht + ", Wt = " + wt;
    }
}
