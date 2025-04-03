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
    public static void helper(int[] nums,List<Integer> ds,boolean[] isValid,List<List<Integer>> ans){
        int n = nums.length;
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(isValid[i]==false){ // call lgega
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];  // false
        helper(nums,new ArrayList<>(),isValid,ans);
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
