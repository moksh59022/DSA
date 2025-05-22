package Brown;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for (int i = 0; i < n; i++) {
            candidates[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        List<List<Integer>> ans = combinationSum(candidates,target);

        if(ans.isEmpty()){
            System.out.println("-1");
        }else {
            for (List<Integer> combination : ans){
                for (int num : combination){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private static void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans ,List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target - arr[ind] , ans,ds);
            ds.remove(ds.size()-1);
        }
            findCombinations(ind+1,arr,target,ans,ds);
    }
}
