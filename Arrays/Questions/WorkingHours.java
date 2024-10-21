package Arrays.Questions;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       int count = 0;
        System.out.println("Enter working hours: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target hours: ");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]<target){
            count++;
            }
        }
        System.out.println("Total worker who worked less: "+count);
    }
}
