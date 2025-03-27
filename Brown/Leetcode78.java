package Brown;


import java.util.*;

public class Leetcode78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> ans = subset(nums);
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
    public static List<List<Integer>> subset(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total = 1<<n;
        for(int num = 0;num<total;num++){
            List<Integer> list = new ArrayList<>();
            for (int bitIdx = 0; bitIdx < n; bitIdx++) {
                int mask = 1<<bitIdx;
                if((num & mask) != 0) list.add(nums[bitIdx]);
            }
            ans.add(list);
        }
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
