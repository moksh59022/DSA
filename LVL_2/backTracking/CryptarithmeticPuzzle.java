package LVL_2.backTracking;

import java.util.HashMap;
import java.util.Scanner;

public class CryptarithmeticPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        HashMap<Character,Integer> charIntMap = new HashMap<>();
        String unique = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!charIntMap.containsKey(ch)) {
                charIntMap.put(ch, -1);
                unique += ch;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!charIntMap.containsKey(ch)) {
                charIntMap.put(ch, -1);
                unique += ch;
            }
        }
        for (int i = 0; i < s3.length(); i++) {   // ✅ fixed (was s2 before)
            char ch = s3.charAt(i);
            if (!charIntMap.containsKey(ch)) {
                charIntMap.put(ch, -1);
                unique += ch;
            }
        }

        boolean[] usedNumbers = new boolean[10];
        solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }

    private static void solution(String unique, int idx, HashMap<Character, Integer> charIntMap,
                                 boolean[] usedNumbers, String s1, String s2, String s3) {
        if (idx == unique.length()) {
            // prevent leading zeros
            if (charIntMap.get(s1.charAt(0)) == 0 ||
                    charIntMap.get(s2.charAt(0)) == 0 ||
                    charIntMap.get(s3.charAt(0)) == 0) {
                return;
            }

            int num1 = getNum(s1, charIntMap);
            int num2 = getNum(s2, charIntMap);
            int num3 = getNum(s3, charIntMap);

            if (num1 + num2 == num3) {
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a' + i);
                    if (charIntMap.containsKey(ch)) {
                        System.out.println(ch + " - " + charIntMap.get(ch));
                    }
                }
                System.out.println();
            }
            return;
        }

        char ch = unique.charAt(idx);
        for (int num = 0; num <= 9; num++) {
            if (!usedNumbers[num]) {
                charIntMap.put(ch, num);
                usedNumbers[num] = true;
                solution(unique, idx + 1, charIntMap, usedNumbers, s1, s2, s3);
                usedNumbers[num] = false;
                charIntMap.put(ch, -1);
            }
        }
    }

    private static int getNum(String s, HashMap<Character, Integer> charIntMap) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            num.append(charIntMap.get(s.charAt(i)));
        }
        return Integer.parseInt(num.toString());
    }
}
