package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbcccccccccccjjjjjjjjjjjjfffffff";
        char[] ch = s.toCharArray();
        String ans = "";
        int i = 0,j=0;
        while (j<ch.length){
            if (ch[j]==ch[i]) j++;

            else {
                ans+=ch[i];
                int len = j-i;
                if(len>1) ans+=len;
                i = j;

            }
        }
        ans+=ch[i];             //for
        int len = j-i;          //last asi j<n
        if(len>1) ans+=len;
        System.out.println(ans);
    }
}
