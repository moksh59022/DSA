package LVL_2.backTracking;

import java.util.HashSet;
import java.util.Scanner;

public class KLengthWordsPartTwo {

    public static void generateWords(int cc, int ts, String ustr, HashSet<Character> used, String asf) {
        if (cc > ts) {
            System.out.println(asf);
            return;
        }

        // Try placing each unused char
        for (int i = 0; i < ustr.length(); i++) {
            char ch = ustr.charAt(i);
            if (!used.contains(ch)) {
                used.add(ch);
                generateWords(cc + 1, ts, ustr, used, asf + ch);
                used.remove(ch); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string (may contain duplicates)
        String str = sc.next();
        int k = sc.nextInt();

        // make unique string
        HashSet<Character> set = new HashSet<>();
        StringBuilder ustr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                ustr.append(ch);
            }
        }

        generateWords(1, k, ustr.toString(), new HashSet<>(), "");
        sc.close();
    }
}
