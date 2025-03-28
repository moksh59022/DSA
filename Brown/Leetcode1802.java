package Brown;

import java.util.Scanner;

public class Leetcode1802 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int index = sc.nextInt();
            int maxSum = sc.nextInt();

            int left = index;
            int right = n - index - 1;
            int low = 1, high = maxSum;

            while (low < high) {
                int mid = (low + high + 1) / 2;
                if (canBuild(mid, left, right, maxSum)) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(low);
        }

        static boolean canBuild(int target, int left, int right, int maxSum) {
            long sum = target;

            // Elements to the left of index
            if (target > left) {
                sum += (long) (target - 1 + target - left) * left / 2;
            } else {
                sum += left;
            }

            // Elements to the right of index
            if (target > right) {
                sum += (long) (target - 1 + target - right) * right / 2;
            } else {
                sum += right;
            }

            return sum <= maxSum;
        }
    }


