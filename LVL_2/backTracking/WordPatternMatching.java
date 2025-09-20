package LVL_2.backTracking;

import java.util.HashMap;
import java.util.HashSet;

public class WordPatternMatching {
    public static void sol(String str, String pattern, HashMap<Character,String> map) {
        if (pattern.length() == 0) {
            if (str.length() == 0) {
                // print mapping
                HashSet<Character> alreadyPrinted = new HashSet<>();
                for (char ch : map.keySet()) {
                    if (!alreadyPrinted.contains(ch)) {
                        System.out.print(ch + " -> " + map.get(ch) + " , ");
                        alreadyPrinted.add(ch);
                    }
                }
                System.out.println(".");
            }
            return;
        }

        char ch = pattern.charAt(0);
        String rop = pattern.substring(1);

        if (map.containsKey(ch)) {
            String previousMapping = map.get(ch);
            if (str.length() >= previousMapping.length()) {
                String left = str.substring(0, previousMapping.length());
                String right = str.substring(previousMapping.length());
                if (previousMapping.equals(left)) {
                    sol(right, rop, map);
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                String left = str.substring(0, i + 1);
                String right = str.substring(i + 1);
                map.put(ch, left);
                sol(right, rop, map);
                map.remove(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "graphtreegraph";
        String pattern = "pep";
        sol(str, pattern, new HashMap<>());
    }
}
