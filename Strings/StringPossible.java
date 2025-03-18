package Strings;

import java.util.Scanner;

public class StringPossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean isPalindromeFound = false;

        for(int i = 0 ; i<n;i++){

            String rotated = s.substring(i)+s.substring(0,i);
             boolean isPalindrome = true;
            int left = 0 ,right=n-1;
            while (left<right){
                if(rotated.charAt(left)!=rotated.charAt(right)){
                    isPalindrome=false;
                    break;
                }
                left++;
                right--;
            }
            if (isPalindrome){
                System.out.println("YES");
                isPalindromeFound=true;
                break;
            }
        }
        if (!isPalindromeFound){
            System.out.println("NO");
        }
    }
}
