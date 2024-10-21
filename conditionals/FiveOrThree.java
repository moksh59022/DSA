package conditionals;

import java.util.Scanner;

public class FiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = sc.nextInt();
        if((a % 5==0) || (a % 3==0)){
            System.out.println("no is divisible by 3 or 5");
        }else System.out.println("no is not divisible by 5 or 3");
    }
}
