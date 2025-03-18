package Brown;

import java.util.*;
class domino{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String dominoes = sc.nextLine();
        System.out.print(pushDominoes(dominoes));

    }

    public static String pushDominoes(String dominoes){

        int n = dominoes.length();
        int[] left = new int[n];
        int nearestLeftIndex = -1;
        for(int i = n-1;i>=0;i--){
            char ch = dominoes.charAt(i);
            if(ch=='L'){
                nearestLeftIndex = i;
            }
            else if(ch=='R'){
                nearestLeftIndex = -1;
            }
            left[i] = nearestLeftIndex;
        }


        int[] right = new int[n];
        int nearestRightIndex = -1;
        for(int i = 0;i<n;i++){
            char ch = dominoes.charAt(i);
            if(ch=='R'){
                nearestRightIndex = i;
            }
            else if(ch=='L'){
                nearestRightIndex = -1;
            }
            right[i] = nearestRightIndex;
        }

        char[] ans = new char[n];

        for(int i = 0;i<n;i++){
            int leftIdx = left[i];
            int rightIdx = right[i];

            int leftDiff = leftIdx == -1 ? Integer.MAX_VALUE : Math.abs(leftIdx-i);
            int rightDiff = rightIdx == -1 ? Integer.MAX_VALUE : Math.abs(rightIdx-i);

            if(leftDiff == rightDiff){
                ans[i] = '.';

            }
            else if(leftDiff<rightDiff){
                ans[i] = 'L';
            }
            else{
                ans[i] = 'R';
            }

        }

        return new String(ans);

    }
}