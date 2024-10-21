package gagan;

public class SelectionSort {
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap without using extra variable (using addition and subtraction)
            if (minIdx != i) {
                arr[i] = arr[i] + arr[minIdx];  // Step 1: arr[i] = arr[i] + arr[minIdx]
                arr[minIdx] = arr[i] - arr[minIdx];  // Step 2: arr[minIdx] = arr[i] - arr[minIdx]
                arr[i] = arr[i] - arr[minIdx];  // Step 3: arr[i] = arr[i] - arr[minIdx]
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
