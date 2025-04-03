package Brown;

import java.util.ArrayList;
import java.util.*;

public class Leetcode40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for(int i = 0;i<n;i++){
            candidates[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        List<List<Integer>> ans = combination(candidates,target);

        for(List<Integer> combo : ans){
            for(int ele : combo){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> combination(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,ans,new ArrayList<>());

        return ans;
    }

    public static void backtrack(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            backtrack(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size() - 1);
        }
    }

}
