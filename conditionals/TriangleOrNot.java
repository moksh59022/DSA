package conditionals;

public class TriangleOrNot {
    public static void main(String[] args) {
        int a = 4 , b=5 , c=5;
    if(a+b>c && a+c>b && b+c>a)
        System.out.println("valid triangle");
    else {
        System.out.println("invalid triangle");
    }

    }
}
