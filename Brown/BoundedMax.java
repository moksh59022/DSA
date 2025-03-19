package Brown;

import java.util.Scanner;

public class BoundedMax {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int result = countSubarrays(nums, left, right);
            System.out.println(result);

            sc.close();
        }

        // Function to count subarrays with bounded maximum
        public static int countSubarrays(int[] nums, int left, int right) {
            int start = 0;
            int lastValid = -1;
            int result = 0;

            for (int end = 0; end < nums.length; end++) {
                if (nums[end] >= left && nums[end] <= right) {
                    lastValid = end;
                }
                if (nums[end] > right) {
                    start = end + 1;
                    lastValid = -1;
                }
                if (lastValid != -1) {
                    result += lastValid - start + 1;
                }
            }

            return result;
        }
    }

