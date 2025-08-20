package AdvanceSorting;

public class RadixSort {
    public static void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            max = Math.max(max,val);
        }
        int exp = 1;

        while (exp <= max){
            countSort(arr,exp);
            exp = exp * 10;
        }
    }

    public static void countSort(int[] arr,int exp){
        int[] ans = new int[arr.length];

        // make frequency array (digits 0–9)
        int[] farr = new int[10];
        for(int i = 0;i<arr.length;i++){
            farr[(arr[i]/exp) % 10]++;
        }

        // convert it to prefix sum array
        for (int i = 1; i < farr.length; i++) {
            farr[i] += farr[i-1];
        }

        // Stable sorting
        for (int i = arr.length-1; i >=0; i--) {
            int pos = farr[(arr[i] / exp) % 10]-1;
            ans[pos] = arr[i];
            farr[(arr[i]/exp) % 10]--;
        }

        // filling original arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);

        System.out.print("Sorted Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
