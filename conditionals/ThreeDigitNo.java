package conditionals;

import java.util.Scanner;

public class ThreeDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any no : ");
        int a = sc.nextInt();
        if(a>99&&a<1000){
            System.out.println("3 digit number");
        }else System.out.println("not 3 digit no");
    }
}
