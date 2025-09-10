package LVL_2.backTracking;

import java.util.Scanner;

public class FriendsPairing {
    static int counter = 1;

    public static void sol(int i,int n,boolean[] used,String asf){
        if (i>n){
            System.out.println(counter+"."+asf);
            counter++;
            return;
        }
        if (used[i]==true){
            sol(i+1,n,used,asf);
        }
        else {
            used[i] = true;
            sol(i+1,n,used,asf+"("+i+") ");
            for (int j = i+1; j <= n; j++) {
                used[j] = true;
                sol(i+1,n,used,asf+"("+i+j+")");
                used[j] = false;
            }
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] used = new boolean[n+1];
        sol(1,n,used,"");
    }
}
