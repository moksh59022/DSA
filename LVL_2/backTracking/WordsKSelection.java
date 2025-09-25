package LVL_2.backTracking;

public class WordsKSelection {

    public static void sol(int i, String ustr, int ssf, int ts, String asf) {
        // base case
        if (i == ustr.length()) {
            if (ssf == ts) {
                System.out.println(asf);
            }
            return;
        }

        char ch = ustr.charAt(i);

        // option 1: don't include current character
        sol(i + 1, ustr, ssf, ts, asf);

        // option 2: include current character
        sol(i + 1, ustr, ssf + 1, ts, asf + ch);
    }

    public static void main(String[] args) {
        String str = "abc";   // unique string (assume already deduplicated)
        int k = 2;            // choose k characters

        sol(0, str, 0, k, "");
    }
}
