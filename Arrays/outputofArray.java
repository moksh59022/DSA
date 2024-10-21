package Arrays;

import java.util.Scanner;

public class outputofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array: ");
       int[] arr = new int[n];
// to take elements
        for (int i = 0; i <=n-1 ; i++) {
            arr[i] = sc.nextInt();
        }

// to output elements

        for (int i = 0; i <=n-1 ; i++) {
            int b = arr[i];
            System.out.print(b+" ");
        }

        System.out.println();


        int[] ar0 = {1,3,4,5,5,66,6,666,5,5,5,5,5,5,556,6665,5,55,5,56,85,66};
        for (int i = 0; i < ar0.length; i++) {
            System.out.print(ar0[i]+" ");
        }

    }
}
