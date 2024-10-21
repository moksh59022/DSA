package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < n / 2; i++) {
//            int j = n-i-1;
//            int a = arr[i];
//            arr[i] = arr[j];
//            arr[j] = a;
//        }
//        for (int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();

        int k = 2 ,l = 4;  // swapping part of array;
        while (k<=l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();

    }
}
