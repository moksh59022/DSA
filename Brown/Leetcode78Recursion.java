package Brown;
import java.util.*;
public class Leetcode78Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> ans = subsets(nums);
        if(ans.isEmpty()){
            System.out.println("-1");
        }
        else {
            for (List<Integer> combo : ans){
                for (int num : combo){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        }
    }

    public static void helper(int idx,int[] nums,List<List<Integer>> ans , List<Integer> ds){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        helper(idx+1,nums,ans,ds); // not take
        ds.add(nums[idx]);
        helper(idx+1,nums,ans,ds); // take
        ds.remove(ds.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,ans,new ArrayList<>());
        ans.sort((a,b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if(!a.get(i).equals(b.get(i))){
                    return a.get(i) - b.get(i);
                }
            }
            return  a.size() - b.size();
        });
        return ans;
    }
    
}
