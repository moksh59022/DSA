package Arrays.Questions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Original array and rotation count
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;  // Number of positions to rotate

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the rotated array
        int[] rotatedArray = getRotatedArray(arr, k);

        // Print the new rotated array
        System.out.println("New Rotated Array: " + Arrays.toString(rotatedArray));
    }

    public static int[] getRotatedArray(int[] arr, int k) {
        int n = arr.length;

        // Adjust k if it is greater than array length
        k = k % n;

        // Create a new array to store the rotated result
        int[] rotated = new int[n];

        // Single loop to copy the rotated values
        for (int i = 0; i < n; i++) {
            // Calculate the new index for each element
            rotated[(i + k) % n] = arr[i];
        }

        // Return the rotated array
        return rotated;
    }
}
