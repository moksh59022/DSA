package TwoDimensionalArray;

public class MaxInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,2},{1,5,7},{3,-9,6}};
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        int p =1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mx = Math.max(mx,arr[i][j]);
                sum+=arr[i][j];
                p*=arr[i][j];
            }
        }
        System.out.println(mx);
        System.out.println(sum);
        System.out.println(p+" ");
    }
}
