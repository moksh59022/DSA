package LVL_2.backTracking;

import java.util.*;

public class PartitionInKSubsets {
    public static int counter = 0;
    public static void solution(int i,int n,int k,int nos,ArrayList<ArrayList<Integer>> ans){
        if (i>n){
            if (nos==k){
                counter++;
                System.out.println(counter+". ");
                for (ArrayList<Integer> set : ans){
                    System.out.println(set+" ");
                }
            }
            return;
        }
        for (int j = 0; j < ans.size(); j++) {
            if (ans.get(j).size() > 0){
                ans.get(j).add(i);
                solution(i+1,n,k,nos,ans);
                ans.get(j).remove(ans.get(j).size()-1);
            }
            else {
                ans.get(j).add(i);
                solution(i+1,n,k,nos,ans);
                ans.get(j).remove(ans.get(j).size()-1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            ans.add(new ArrayList<>());
        }
        solution(1,n,k,0,ans);

    }
}
