package Recursion;

public class ArrayTraversal {
    public static void print(int i,int[] arr){
        int n = arr.length;
        if(i==n) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
      int[] arr = {1,2,5,8,9};

      print(0,arr);
    }
}
