package loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        if(a==0||b==0) {
            max=0;
            System.out.println(max);
        }
        while(true){
           if(a!=0||b!=0) {
               if (max % a == 0 && max % b == 0) {
                   System.out.println(max);
                   break;
               }
               max++;
           }
        }



    }
}
