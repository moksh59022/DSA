package Graph;

import java.util.*;

public class MultiPaths {
    static String spath = "";
    static Integer spathwt = Integer.MAX_VALUE;
    static String lpath = "";
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath = "";
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath = "";
    static Integer fpathwt = Integer.MIN_VALUE;

    static class Pair implements Comparable<Pair> {
        int wsf;     // weight so far
        String psf;  // path so far

        Pair(int wsf, String psf) {
            this.wsf = wsf;
            this.psf = psf;
        }

        public int compareTo(Pair o) {
            return this.wsf - o.wsf;
        }
    }

    public static void dfs(int src, int dest, boolean[] vis,
                           List<List<int[]>> adj,
                           String psf, int wsf, int criteria, int k,
                           PriorityQueue<Pair> pq) {

        if (src == dest) {
            // shortest path
            if (wsf < spathwt) {
                spathwt = wsf;
                spath = psf;
            }

            // longest path
            if (wsf > lpathwt) {
                lpathwt = wsf;
                lpath = psf;
            }

            // ceil path
            if (wsf > criteria && wsf < cpathwt) {
                cpathwt = wsf;
                cpath = psf;
            }

            // floor path
            if (wsf < criteria && wsf > fpathwt) {
                fpathwt = wsf;
                fpath = psf;
            }

            // kth largest
            if (pq.size() < k) {
                pq.add(new Pair(wsf, psf));
            } else {
                if (wsf > pq.peek().wsf) {
                    pq.remove();
                    pq.add(new Pair(wsf, psf));
                }
            }

            return;
        }

        vis[src] = true;

        for (int[] edge : adj.get(src)) {
            int nbr = edge[0];
            int wt = edge[1];
            if (!vis[nbr]) {
                dfs(nbr, dest, vis, adj, psf + nbr, wsf + wt, criteria, k, pq);
            }
        }

        vis[src] = false;
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {
                {0, 1, 10},
                {0, 3, 40},
                {1, 2, 10},
                {2, 3, 10},
                {3, 4, 2},
                {4, 5, 3},
                {4, 6, 8},
                {5, 6, 3}
        };

        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            int u = e[0], v = e[1], wt = e[2];
            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt});
        }

        int src = 0, dest = 6;
        int criteria = 42;
        int k = 3;
        boolean[] vis = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        dfs(src, dest, vis, adj, src + "", 0, criteria, k, pq);

        System.out.println("Smallest Path = " + spath + "@" + spathwt);
        System.out.println("Largest Path = " + lpath + "@" + lpathwt);
        System.out.println("Ceil Path = " + cpath + "@" + cpathwt);
        System.out.println("Floor Path = " + fpath + "@" + fpathwt);
        System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
    }
}
