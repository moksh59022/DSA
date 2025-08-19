package AdvanceSorting;

import java.util.*;

public class CountSort {
    public static void countSort(int[] arr,int min,int max){
        int range = max - min + 1;
        int[] freq = new int[range];

        // Frequency array
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            freq[idx]++;
        }

        // Prefix sum (cumulative frequency)
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        // Stable sorting (fill ans array from back)
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = freq[val - min];
            int idx = pos - 1;
            ans[idx] = val;  // ✅ FIXED
            freq[val - min]--;
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find min and max
        int min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Call count sort
        countSort(arr, min, max);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
