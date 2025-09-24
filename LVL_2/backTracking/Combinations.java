package LVL_2.backTracking;

public class Combinations {
    public static void combinations(int cb, int tb, int ssf, int ts, String asf){
        if(cb > tb){
            if (ssf == ts){
                System.out.println(asf);
            }
            return;
        }

        // Include current box
        combinations(cb + 1, tb, ssf + 1, ts, asf + "i");

        // Exclude current box
        combinations(cb + 1, tb, ssf, ts, asf + "-");
    }

    public static void main(String[] args) {
        int totalBoxes = 4;
        int totalSelections = 2;
        combinations(1, totalBoxes, 0, totalSelections, "");
    }
}
