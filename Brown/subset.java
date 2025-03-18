package Brown;
import java.util.*;
class subset{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(canPartition(arr));
    }


    public static boolean canPartition(int[] arr){
        int n = arr.length;
        int sum = 0;

        for(int ele : arr){
            sum+=ele;
        }

        if(sum%2!=0) return false;

        int target = sum/2;

        int[][] dp = new int[arr.length][target+1];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<target+1;j++){
                dp[i][j] = -1;
            }
        }

        return subsetsum(0,arr,target,dp);

    }

    public static boolean subsetsum(int idx, int[] arr, int target, int[][] dp){
        if(idx==arr.length){
            if(target==0){
                return true;
            }
        }

        boolean ans = false;

        boolean skip = subsetsum(idx+1,arr,target,dp);

        if(target - arr[idx]<0){
            ans = skip;
        }
        else{
            boolean take = subsetsum(idx+1,arr,target-arr[idx],dp);
            ans = take || skip;
        }

         dp[idx][target] = (ans) ? 1 : 0;
         return ans;



    }
}

