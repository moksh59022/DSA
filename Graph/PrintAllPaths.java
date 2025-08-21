package Graph;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPaths {
    public void printAllPaths(int n, int[][] edges, int start, int end) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a); // remove if graph is directed
        }

        boolean[] vis = new boolean[n];
        List<Integer> path = new ArrayList<>();
        path.add(start);

        dfs(start, adj, vis, end, path);
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] vis, int end, List<Integer> path) {
        if (node == end) {
            System.out.println(path); // found one path
            return;
        }

        vis[node] = true; // mark current node as visited

        for (int next : adj.get(node)) {
            if (!vis[next]) {
                path.add(next);         // choose
                dfs(next, adj, vis, end, path); // explore
                path.remove(path.size() - 1);   // un-choose (backtrack)
            }
        }

        vis[node] = false; // allow node for other possible paths
    }

    public static void main(String[] args) {
        PrintAllPaths obj = new PrintAllPaths();
        int n = 5;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3},
                {3, 4}
        };
        int start = 0, end = 4;

        obj.printAllPaths(n, edges, start, end);
    }
}
