package Brown;

import java.util.Scanner;

public class Leetcode1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxOnes(nums,k));
    }

    private static int maxOnes(int[] nums, int k) {
        int left = 0;
        int window = 0;
        int zero = 0;

        for (int right = 0; right < nums.length; right++) {
            if(nums[right]!=1){
                zero++;
            }
            if (zero>k){
                if (nums[left]==0){
                    zero--;
                }
                left++;
            }
            window = Math.max(right-left+1,window);
        }
        return window;
    }
}
