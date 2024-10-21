package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicOfArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(6);
        arr.add(0,2);
        arr.add(1,33);
        arr.add(2,66);
        arr.add(3,44);
        arr.add(4,33);
        arr.add(5,33);
        System.out.println(arr.get(2));
        System.out.println(arr);
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(4,60);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        arr.add(60);
        System.out.println();
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
