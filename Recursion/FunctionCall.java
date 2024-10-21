package Recursion;

public class FunctionCall {
    public static void apple(){
        mango();
        System.out.println("apple");
        banana();
    }
    public static void banana(){
        System.out.println("banana");
    }
    public static void mango(){
        banana();
        System.out.println("mango");
    }



    public static void main(String[] args) {
        System.out.println("main");
        apple();
    }
}
