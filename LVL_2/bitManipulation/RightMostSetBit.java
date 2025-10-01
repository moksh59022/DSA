package LVL_2.bitManipulation;

import java.util.Scanner;

public class RightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rsbm = n & -n;
        System.out.println(Integer.toBinaryString(rsbm));
    }
}
