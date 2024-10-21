package conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();
        Scanner SC = new Scanner(System.in);
        System.out.print("enter a number : ");
        int b = sc.nextInt();
        Scanner ac = new Scanner(System.in);
        System.out.print("enter a number : ");
        int c = sc.nextInt();
        int max = a>b? b>c? a:b : b>c? b:c;
        System.out.println("greatest number is : "+max);
    }
}
