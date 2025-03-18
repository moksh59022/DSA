package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArray {
    public static void main(String[] args) {

        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();

        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) ans.add(pq.remove());
        }

        while (pq.size()>0){
            ans.add(pq.remove());
        }
        System.out.println(ans);

    }
}
