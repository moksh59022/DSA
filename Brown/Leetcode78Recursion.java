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

    static List<List<Integer>> arr;
    public static void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans); // not take
        ans.add(nums[i]);
        helper(i+1,nums,ans); // take
        ans.remove(ans.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,nums,ans);
        arr.sort((a,b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if(!a.get(i).equals(b.get(i))){
                    return a.get(i) - b.get(i);
                }
            }
            return  a.size() - b.size();
        });
        return arr;
    }
}
