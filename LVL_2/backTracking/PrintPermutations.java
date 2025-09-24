package LVL_2.backTracking;

public class PrintPermutations {
    public static void permute(int[] arr,int ci,int ti){
        if (ci > ti){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = ci;
                permute(arr,ci+1,ti);
                arr[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        permute(arr, 1, n);
    }
}
