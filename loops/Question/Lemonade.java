package loops.Question;

import java.util.Scanner;

public class Lemonade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bills = new int[n];

        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }

        int five = 0;
        int ten = 0;

        for (int i = 0; i < n; i++) {
            int bill = bills[i];

            if(bills[i]==5){
                five++;
            }
            else if (bills[i]==10){
                if (five==0){
                    System.out.println("false");
                    return;
                }
                five--;
                ten--;
            }
            else {
                if(ten>0 && five>0){
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five-=3;
                }
                else {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
