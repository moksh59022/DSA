package Brown;

import java.util.Scanner;
import java.util.Stack;

public class Leetcode2104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subArrayRanges(arr));
    }

    public static long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    // Sum of all maximum values in all subarrays
    private static long sumMax(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Find how many subarrays nums[i] is the maximum (to the left)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Find how many subarrays nums[i] is the maximum (to the right)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Contribution of nums[i] as maximum
        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * left[i] * right[i];
        }

        return sum;
    }

    // Sum of all minimum values in all subarrays
    private static long sumMin(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Find how many subarrays nums[i] is the minimum (to the left)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Find how many subarrays nums[i] is the minimum (to the right)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Contribution of nums[i] as minimum
        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * left[i] * right[i];
        }

        return sum;
    }
}


