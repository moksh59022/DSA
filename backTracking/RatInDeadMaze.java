package backTracking;

public class RatInDeadMaze {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int[][] maze = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        printpaths(0,0,rows-1,cols-1,"",maze);
    }

    private static void printpaths(int sr, int sc, int er, int ec,String s,int[][] maze) {
        if(sr>er||sc>ec) return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]==0) return;
        printpaths(sr,sc+1,er,ec,s+"R",maze);
        printpaths(sr+1,sc,er,ec,s+"D",maze);
    }
}
