package Brown;

import java.util.Scanner;

public class Leetcode1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(getMaximumGold(grid));

    }
    private static int max = 0;

    public static void travelAndCollectGold(int[][] arr, int i, int j, boolean[][] visited, int currentSum) {
        // Base case: out of bounds or invalid cell
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0 || visited[i][j]) {
            return;
        }

        // Collect gold
        currentSum += arr[i][j];
        visited[i][j] = true;
        max = Math.max(max, currentSum);

        // Explore all 4 directions
        travelAndCollectGold(arr, i - 1, j, visited, currentSum); // up
        travelAndCollectGold(arr, i + 1, j, visited, currentSum); // down
        travelAndCollectGold(arr, i, j - 1, visited, currentSum); // left
        travelAndCollectGold(arr, i, j + 1, visited, currentSum); // right

        // Backtrack (restore state)
        visited[i][j] = false;
    }

    public static int getMaximumGold(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean[][] visited = new boolean[n][m];

        max = 0; // Reset max for each test case

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != 0) {
                    travelAndCollectGold(arr, i, j, visited, 0);
                }
            }
        }
        return max;
    }
}
