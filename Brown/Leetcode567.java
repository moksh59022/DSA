package Brown;

import java.util.Scanner;

public class Leetcode567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(checkInclusion(s1,s2));
    }

    private static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (m<n) return false;

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for(int i = 0;i<n;i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;
        }

        if(isMatched(map1,map2)) return true;

        for(int i = 1;i<=m-n;i++){
            map2[s2.charAt(i-1)-'a']--;
            map2[s2.charAt(n+i-1)-'a']++;
            if(isMatched(map1,map2)){
                return true;
            }
        }
        return false;

    }

    private static boolean isMatched(int[] map1, int[] map2) {
        for(int i = 0;i<26;i++){
            if(map1[i]!=map2[i]) return false;
        }
        return true;
    }
}
