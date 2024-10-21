package loops;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {





//        int n = 5 , sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//
//        }    System.out.println(sum);
//
//        int x = 4;
//        for (int i = 1; i <= 10; i++) {
//        System.out.println(x +" * "+i+" = "+ x *i);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your first number : ");
//        int a = sc.nextInt();
//        System.out.print("enter your second number : ");
//        int b = sc.nextInt();
//        int min = Math.min(a,b);
//        int gcd = 0;
//        for (int i = 1; i <=min; i++) {
//            if (a % i==0 && b % i==0){
//             gcd = i;
//            }
//        }  System.out.println("the greatest common difference of two numbers are : "+gcd);
//
//        }
    //    System.out.println("hello");

//float a = 5.43f;
//float b = 2.653f;
//      float d = (a/b);
//
//        System.out.println(a/b);

//        int n = 4;
//        int m = 8;
//
//        if (n < m)
//            System.out.print("lesser");
//        else if (n == m)
//            System.out.print("equal");
//        else if (n > m)
//            System.out.print("greater");


        String reversed = revStr("moksh");
        System.out.println(reversed);



    }
//static String revStr(String s){
//        if (s==null){
//         return null;
//        }
//        stringBuilderBasics sb = new stringBuilderBasics(s);
//        return sb.reverse().toString();

    static String revStr(String s){
        if (s==null){
            return null;
        }
        StringBuilder ab = new StringBuilder(s);
        return ab.reverse().toString();
    }

}


