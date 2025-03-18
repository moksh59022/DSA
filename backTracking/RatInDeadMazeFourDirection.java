package backTracking;

public class RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int[][] maze = {{1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}};
        boolean[][] isVisited = new boolean[rows][cols];
        printpaths(0,0,rows-1,cols-1,"",maze,isVisited);
    }

    private static void printpaths(int sr, int sc, int er, int ec,String s,int[][] maze,boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er||sc>ec) return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]==0) return;
        if (isVisited[sr][sc]) return;

        isVisited[sr][sc] = true;
        // go right
        printpaths(sr,sc+1,er,ec,s+"R",maze,isVisited);
        // go down
        printpaths(sr+1,sc,er,ec,s+"D",maze,isVisited);
        // go left
        printpaths(sr,sc-1,er,ec,s+"L",maze,isVisited);
        // go up
        printpaths(sr-1,sc,er,ec,s+"U",maze,isVisited);
        // backtracking
        isVisited[sr][sc] = false;
    }
}
