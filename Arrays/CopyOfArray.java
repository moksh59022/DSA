package Arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr ={1,3};
        int[] arr2 ={2};
        int[] num = arr;
        num[0] = 50;
        System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 7;
        System.out.println(brr[0]);
        int[] ans = new int[arr.length+arr2.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            ans[i+arr.length] = arr2[i];
        }

        Arrays.sort(ans);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
//        for(int i = 1; i <= 4; i++){
//            for (int j = 4; j >= i; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


    }
}
