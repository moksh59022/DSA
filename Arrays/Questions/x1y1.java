package Arrays.Questions;

import java.util.Scanner;

public class x1y1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for (int i = 0; i < n/2; i++) {
            result[2*i]= arr[i];
            result[(2*i)+1] = arr[i+n/2];
        }
        for (int ele : result){
            System.out.print(ele+" ");
        }
    }
}
