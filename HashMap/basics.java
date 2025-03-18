package HashMap;

import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(99);
        set.add(85);
        set.add(-15);
        set.add(177);
        set.add(12);
        System.out.println(set);
        set.remove(50);
        System.out.println(set+" "+set.size());
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(12);

        Object[] arr = set.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
