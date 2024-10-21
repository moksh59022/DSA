package Arrays.Questions;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

   // taking element
     int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
    // making array to store running sum
        int[] runningSum = new int[n];
        runningSum[0] = arr[0];  // 0 index will be same
        for (int i = 1; i < n; i++) {
            runningSum[i]=runningSum[i-1]+arr[i];  //in initial state runningSum={0,0,0,0,0};
        }
        for (int i = 0; i < n; i++) {
            System.out.print(runningSum[i]+" ");

        }


    }
}
