package OOPSinJAVA;

import java.util.Arrays;

public class ArrayList {
    public static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;
         public void add(int ele){
             if (size==arr.length){
                 int[] brr = Arrays.copyOf(arr, arr.length*2);
//                 arr = new int[brr.length];
//                 arr = Arrays.copyOf(brr,brr.length);
                 arr = brr;
             }
             arr[idx] = ele;
             idx++;
             size++;
         }
         public void set(int idx,int val){
             arr[idx]=val;
         }

    }
    public static void main(String[] args) {
      Arraylist arr = new Arraylist();
      arr.add(2);
      arr.add(9);
      arr.add(5);
      arr.add(5);
      arr.add(5);
      arr.set(0,80);
      System.out.println(arr.size);
    }
}
