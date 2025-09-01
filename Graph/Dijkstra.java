package Graph;

import java.util.*;

// Dijkstra's Algorithm Implementation
public class Dijkstra {
    // Edge class for adjacency list
    static class Edge {
        int nbr;
        int wt;
        Edge(int nbr, int wt) {
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    // Pair for PriorityQueue
    class Pair implements Comparable<Pair>{
        int v;
        String psf; // path so far
        int wt;     // weight so far
        Pair(int v, String psf, int wt){
            this.v = v;
            this.psf = psf;
            this.wt = wt;
        }

        public int compareTo(Pair o){
            return this.wt - o.wt;
        }
    }

    // Dijkstra’s Algorithm
    public void dijkstra(ArrayList<Edge>[] graph, int src) {
        int vtces = graph.length;
        boolean[] vis = new boolean[vtces];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, src + "", 0));

        while (!pq.isEmpty()) {
            Pair rem = pq.remove();

            if (vis[rem.v]) continue;
            vis[rem.v] = true;

            // Print the shortest path to this vertex
            System.out.println(rem.v + " via " + rem.psf + " @ " + rem.wt);

            for (Edge e : graph[rem.v]) {
                if (!vis[e.nbr]) {
                    pq.add(new Pair(e.nbr, rem.psf + e.nbr, rem.wt + e.wt));
                }
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        int vtces = 7;
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        // add edges (undirected for example)
        graph[0].add(new Edge(1, 10));
        graph[0].add(new Edge(3, 40));
        graph[1].add(new Edge(0, 10));
        graph[1].add(new Edge(2, 10));
        graph[2].add(new Edge(1, 10));
        graph[2].add(new Edge(3, 10));
        graph[3].add(new Edge(0, 40));
        graph[3].add(new Edge(2, 10));
        graph[3].add(new Edge(4, 2));
        graph[4].add(new Edge(3, 2));
        graph[4].add(new Edge(5, 3));
        graph[5].add(new Edge(4, 3));
        graph[5].add(new Edge(6, 3));
        graph[6].add(new Edge(5, 3));

        Dijkstra obj = new Dijkstra();
        obj.dijkstra(graph, 0);
    }
}
