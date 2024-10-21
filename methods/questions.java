package methods;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {


        method ab = new method();
        ab.sum(2,4);

        method moksh = new method();
        moksh.sum(3737,3838);


        method2 method2 = new method2();
        method2.sqr(10);



        method3 method3 = new method3();
        method3.root(1,4,5);




    }

}
    class method{
        int res;
        int sum(int a, int b){
          res = a+b;
            System.out.println(res);
          return res;

        }

    }

    class method2{

    long sqr(int n){
        long square = 0; ;
        for (int i = 1; i <=n; i++) {
          square = i*i;

            System.out.println("Square of number "+i+" is : "+ square);
        }
        return square;
    }
    }


    class method3{
    double root(int a,int b,int c){
        double d = b*b-4*a*c;

        if(d>0) {
            double root1 = (-b+Math.sqrt(d))/2*a;
            double root2 =  (-b-Math.sqrt(d))/2*a;
            System.out.println("Real and equal roots: " +root1+" "+root2);
        }
        else if (d==0){
            double root = -b/2*a;
            System.out.println("Real and equal roots: "+root);
        }
        else {
            double root1 = (-b+Math.sqrt(-d))/2*a;
            double root2 = (-b-Math.sqrt(-d))/2*a;
            System.out.println("Imaginary roots: "+root1+" "+root2);

        }
        return d;
        }
    }

