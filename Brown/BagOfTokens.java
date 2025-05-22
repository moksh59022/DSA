package Brown;

import java.util.Arrays;
import java.util.Scanner;

public class BagOfTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tokens = new int[n];
        for(int i= 0;i<n;i++){
            tokens[i] = sc.nextInt();
        }
        int power = sc.nextInt();
        System.out.println(bagOfTokensScore(tokens,power));
    }

    private static int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        if (n==0) return 0;
        Arrays.sort(tokens);

        int left = 0,right = n-1;
        int score = 0;

        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                left++;
                score++;
            }
            else if (score>0 && left<right){
                power+=tokens[right];
                right--;
                score--;
            }
            else {
                return score;
            }
        }
        return score;
    }
}
