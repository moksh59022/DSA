package backTracking;

public class PrintPath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        printpaths(1,1,rows,cols,"");
    }

    private static void printpaths(int sr, int sc, int er, int ec,String s) {
        if(sr>er||sc>ec) return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        printpaths(sr,sc+1,er,ec,s+"R");
        printpaths(sr+1,sc,er,ec,s+"D");
    }
}
