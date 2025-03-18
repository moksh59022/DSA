package Dynamic_Programming;

public class MatrixChainMultiplication {
//    public static void main(String[] args) {
//        int[][] arr = {{1,2},{2,3},{3,4}};
//        int n = arr.length;
//        System.out.println(mcm(0,n-1,arr));
//    }

    //    private static int mcm(int i, int j, int[][] arr) {
//        if (i==j) return 0;
//        int minCost = Integer.MAX_VALUE;
//        for (int k = i; k < j; k++) {
//            int x = arr[i][0] * arr[k][1] * arr[j][1];
//            int totalCost = mcm(i,k,arr) + mcm(k+1,j,arr) + x;
//            minCost = Math.min(minCost,totalCost);
//        }
//        return  minCost;
//    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                dp[i][j]=-1;
            }
        }
//        System.out.println(mcm(0, n - 2, arr,dp));
        System.out.println(mcm2(arr));
    }
    private static int mcm2(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];
        for (int i =n-2; i>=0; i--) {
            for (int j = 0; j <= n - 2; j++) {
                if (i >=j) {
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int x = arr[i] * arr[k+1] * arr[j+1];
                    int totalCost = dp[i][k] + dp[k+1][j] + x;
                    minCost = Math.min(minCost, totalCost);
                }
                 dp[i][j] =   minCost;
            }
        }
        return dp[0][n-2];
    }
    private static int mcm(int i, int j, int[] arr,int[][] dp) {
        if (i == j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int x = arr[i] * arr[k+1] * arr[j+1];
            int totalCost = mcm(i, k, arr,dp) + mcm(k + 1, j, arr,dp) + x;
            minCost = Math.min(minCost, totalCost);
        }
        return dp[i][j] =   minCost;
    }
}
