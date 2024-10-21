package conditionals;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length : ");
        int l = sc.nextInt();
        Scanner ac = new Scanner(System.in);
        System.out.print("enter breadth : ");
        int b = ac.nextInt();
        if(l*b>(2*(l+b))){
            System.out.println("area is bigger");
        if(l*b == 2*(l+b)){
            System.out.println("area is equal to perimeter");
        }

        }else System.out.println("perimeter is bigger");
    }
}
