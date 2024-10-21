package AdvanceSorting;

public class MergeSort {
   public static void print(int[] arr){
       for(int ele:arr){
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
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; // base case
        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy pasting
        for(int i = 0;i<n/2;i++){
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);

        // merge these 'a' and 'b'
        merge(a,b,arr);

        // delete a and b to improve space complexity
        a=null;b=null;

   }
    public static void main(String[] args) {
        int[] arr = {10,20,50,10,20,74,6,55};
        mergeSort(arr);
        print(arr);

    }
}
