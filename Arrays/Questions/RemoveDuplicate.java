package Arrays.Questions;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
