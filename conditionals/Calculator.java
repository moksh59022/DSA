package conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = SC.nextInt();
        char op = SC.next().charAt(0);

        int b = SC.nextInt();

 if(op == '+') System.out.println(a+b);
 if(op == '-') System.out.println(a-b);
 if(op == '*') System.out.println(a*b);
 if(op == '/') System.out.println(a/b);

         switch (op){
             case '+':
                 System.out.println(a+b);
                 break;
             case '-':
                 System.out.println(a-b);
                 break;
             case '*':
                 System.out.println(a*b);
                 break;
             case '/':
                 System.out.println(a/b);
                 break;
             default:
                 System.out.println("invalid operator");
    }


    }
}
