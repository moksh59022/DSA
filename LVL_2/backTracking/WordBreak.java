package LVL_2.backTracking;

import java.util.HashSet;

public class WordBreak {
    public static void main(String[] args) {
        String str = "ilikeicecream";
        HashSet<String> dict = new HashSet<>();
        dict.add("i");
        dict.add("like");
        dict.add("ice");
        dict.add("cream");
        dict.add("icecream");

        wordbreak(str, "", dict);
    }

    public static void wordbreak(String str, String ans, HashSet<String> set) {
        if (str.length() == 0) {
            System.out.println(ans.trim());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i + 1); // prefix
            if (set.contains(left)) {
                String right = str.substring(i + 1); // remaining suffix
                wordbreak(right, ans + left + " ", set);
            }
        }
    }
}
