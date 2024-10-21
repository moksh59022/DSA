package loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextShort();
String a = "P";
        for (int i = 2; i < 2*n-1; i++) {
            if (n%i==0) System.out.println("composite number");
            a = "Prime";
            break;

        }if(n==1) System.out.println("neither prime nor composite");

       else if(a == "Prime")System.out.println("prime number");

    }
}
