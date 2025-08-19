package AdvanceSorting;

import java.util.Scanner;

public class QuickSelect {
    public static int quickSelect(int[] arr, int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);

        if (k > pi) {
            return quickSelect(arr, pi + 1, hi, k);
        } else if (k < pi) {
            return quickSelect(arr, lo, pi - 1, k);
        } else {
            return arr[pi]; // return element at pivot index
        }
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (1-based index): ");
        int k = sc.nextInt();

        // Convert to 0-based index for quickselect
        int result = quickSelect(arr, 0, arr.length - 1, k - 1);

        System.out.println(k + "th smallest element is: " + result);

        sc.close();
    }
}
