package Graph;

import java.util.*;

public class CheckCycle {
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
                {2, 3}
        };

        System.out.println(isCyclic(V, edges)); // true
    }


    public static boolean isCyclic(int V, int[][] edges) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a); // undirected graph
        }

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (check(i, adj, vis)) return true;
            }
        }
        return false;
    }

    static class Pair {
        int node, parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean check(int src, List<List<Integer>> adj, boolean[] vis) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        vis[src] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int node = p.node;
            int parent = p.parent;

            for (int nbr : adj.get(node)) {
                if (!vis[nbr]) {
                    vis[nbr] = true;
                    q.add(new Pair(nbr, node));
                } else if (nbr != parent) {
                    return true; // cycle found
                }
            }
        }
        return false;
    }
}

