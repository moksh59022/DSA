package LVL_2.backTracking;

public class CombinationsPartTwo {
    public static void combinations(boolean[] boxes,int ci,int ti,int llb){
        if(ci > ti){
            // print boxes state
            for (int i = 0; i < boxes.length; i++) {
                if (boxes[i]){
                    System.out.print("i ");  // item placed
                } else {
                    System.out.print("_ ");  // empty
                }
            }
            System.out.println();
            return;
        }

        for (int b = llb+1; b < boxes.length; b++) {
            if (!boxes[b]){
                boxes[b] = true;
                combinations(boxes,ci+1,ti,b);
                boxes[b] = false; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // number of boxes
        int r = 2; // number of items
        boolean[] boxes = new boolean[n];
        combinations(boxes,1,r,-1); // start with ci=1, llb=-1
    }
}
