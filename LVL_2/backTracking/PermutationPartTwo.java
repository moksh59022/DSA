package LVL_2.backTracking;

public class PermutationPartTwo {

    public static void permutation(int cb, int tb, int[] items, int ssf, int ts, String asf) {
        if (cb > tb) {
            if (ssf == ts) {
                System.out.println(asf);
            }
            return;
        }

        for (int i = 0; i < ts; i++) {
            if (items[i] == 0) {
                items[i] = 1;  // mark as used
                permutation(cb + 1, tb, items, ssf + 1, ts, asf + (i + 1));
                items[i] = 0;  // backtrack
            }
        }

        // Recurse without selecting any item in current box
        permutation(cb + 1, tb, items, ssf, ts, asf + "_");
    }

    public static void main(String[] args) {
        int totalBoxes = 4;   // example: 3 positions
        int totalItems = 2;   // example: 2 items to place
        int[] items = new int[totalItems];

        permutation(1, totalBoxes, items, 0, totalItems, "");
    }
}
