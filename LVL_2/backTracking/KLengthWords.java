package LVL_2.backTracking;

public class KLengthWords {
    public static void generateWords(int cc, String ustr, int ssf, int ts, Character[] spots) {
        if (cc == ustr.length()) {
            if (ssf == ts) {
                for (int i = 0; i < spots.length; i++) {
                    System.out.print(spots[i]); // print in same line
                }
                System.out.println(); // move to next line after one word
            }
            return;
        }

        char ch = ustr.charAt(cc);

        // Try placing the char in one of the available spots
        for (int i = 0; i < spots.length; i++) {
            if (spots[i] == null) {
                spots[i] = ch;
                generateWords(cc + 1, ustr, ssf + 1, ts, spots);
                spots[i] = null; // backtrack
            }
        }

        // Or skip this char
        generateWords(cc + 1, ustr, ssf, ts, spots);
    }

    public static void main(String[] args) {
        String str = "abc"; // input string
        int k = 2;          // length of words to form
        Character[] spots = new Character[k];
        generateWords(0, str, 0, k, spots);
    }
}
