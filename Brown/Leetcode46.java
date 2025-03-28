package Brown;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = permute(nums);

        for (List<Integer> combo : result) {
            for (int num : combo) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    public static void helper(int[] nums, int idx , List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n-1){
            List<Integer> l = new ArrayList<>();
            for(int i = 0;i<n;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i = idx;i<n;i++){
            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums,0,ans);

        ans.sort((a,b)->{
            for(int i = 0;i<Math.min(a.size(), b.size());i++){
                if(!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });
        return ans;
    }
}
