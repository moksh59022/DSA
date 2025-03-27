package Brown;

import java.util.ArrayList;
import java.util.*;

public class Leetcode40 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] candidates = new int[n];
       for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
       }
       int target = sc.nextInt();
       List<List<Integer>> ans = combinationSum2(candidates,target);
       if (ans.isEmpty()){
           System.out.println("-1");
       }
       else {
           for (List<Integer> combinations : ans){
               for (int num : combinations){
                   System.out.print(num+" ");
               }
               System.out.println();
           }
       }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private static void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size() - 1);
        }
    }
}
