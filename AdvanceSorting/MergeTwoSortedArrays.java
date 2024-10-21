package AdvanceSorting;

public class MergeTwoSortedArrays {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a ,int[] b, int[] c){
        int i = 0,j=0,k=0;
        while (i<a.length && j< b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
            while(j<b.length) c[k++]=b[j++];
            while (i<a.length) c[k++]=a[i++];


    }
    public static void main(String[] args) {
      int[] a = {1,2,3};
      int[] b = {4,5,6,7};
      int[] c = new int[a.length+b.length];
      merge(a,b,c);
      print(c);
    }
}
