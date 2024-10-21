package conditionals;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        if(marks>80){
        System.out.println("very good");
        } else if(marks>60) {
        System.out.println("good");
        } else if (marks>40) {
        System.out.println("average");
        }else System.out.println("fail");
    }}
