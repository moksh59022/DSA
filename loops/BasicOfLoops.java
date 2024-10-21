package loops;

import java.util.Scanner;

public class BasicOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
    }
}
