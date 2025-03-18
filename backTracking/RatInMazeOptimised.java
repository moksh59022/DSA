package backTracking;

public class RatInMazeOptimised {
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
        if(sr<0 || sc<0) return;
        if(sr>er||sc>ec) return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]==0) return;
        if (maze[sr][sc]==-1) return;

        maze[sr][sc] = -1;
        // go right
        printpaths(sr,sc+1,er,ec,s+"R",maze);
        // go down
        printpaths(sr+1,sc,er,ec,s+"D",maze);
        // go left
        printpaths(sr,sc-1,er,ec,s+"L",maze);
        // go up
        printpaths(sr-1,sc,er,ec,s+"U",maze);
        // backtracking
        maze[sr][sc] = 1;
    }
}
