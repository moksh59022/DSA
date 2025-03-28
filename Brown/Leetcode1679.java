package Brown;
import java.util.*;
public class Leetcode1679 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            if(nums[left]+nums[right]>k){
                right--;
            }
            else if(nums[left]+nums[right]<k){
                left++;
            }
            else{
                left++;
                right--;
                ans++;
            }
        }
        return ans;
    }
}
