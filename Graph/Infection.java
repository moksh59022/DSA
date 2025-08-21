package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Infection {
    static class Pair {
        int v;
        int time;
        Pair(int v, int time) {
            this.v = v;
            this.time = time;
        }
    }

    static class Edge {
        int src;
        int nbr;
        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    // BFS infection spread
    public int getTime(ArrayList<Edge>[] graph, int src, int target, int V) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, 1));  // infection starts at time = 1
        int[] vis = new int[V];
        int count = 0;

        while (!q.isEmpty()) {
            Pair rem = q.remove();

            if (vis[rem.v] > 0) continue;
            vis[rem.v] = rem.time;

            if (rem.time > target) break;  // stop if we exceed target time

            count++;

            for (Edge e : graph[rem.v]) {
                if (vis[e.nbr] == 0) {
                    q.add(new Pair(e.nbr, rem.time + 1));
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int V = 7; // number of persons/nodes
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph (undirected)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));

        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));

        Infection obj = new Infection();
        int infected = obj.getTime(graph, 6, 3, V);  // src=6, target=3
        System.out.println("Total infected persons till t=3: " + infected);
    }
}
