package Brown;

import java.util.Scanner;

class LIS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(lengthOfLIS(arr));

    }

    public static int lengthOfLIS(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=n-1;j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]);
                }
            }
            dp[i] += 1;
            max = Math.max(max,dp[i]);
        }

        return max;

    }

}