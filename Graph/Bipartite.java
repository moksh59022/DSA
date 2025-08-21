package Graph;

import java.util.*;

public class Bipartite {
    static class Edge {
        int src, nbr, wt;
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static class Pair {
        int v, level;
        String psf;
        Pair(int v, String psf, int level) {
            this.v = v;
            this.psf = psf;
            this.level = level;
        }
    }

    private static void addEdge(ArrayList<Edge>[] graph, int v1, int v2, int wt) {
        graph[v1].add(new Edge(v1, v2, wt));
        graph[v2].add(new Edge(v2, v1, wt)); // undirected
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) graph[i] = new ArrayList<>();

        // sample undirected graph
        addEdge(graph, 0, 1, 1);
        addEdge(graph, 0, 3, 1);
        addEdge(graph, 1, 2, 1);
        addEdge(graph, 2, 3, 1);
        addEdge(graph, 2, 5, 1);
        addEdge(graph, 3, 4, 1);
        addEdge(graph, 4, 5, 1);
        addEdge(graph, 4, 6, 1);
        addEdge(graph, 5, 6, 1);

        int[] visited = new int[V];
        Arrays.fill(visited, -1); // fix 1

        for (int v = 0; v < V; v++) {
            if (visited[v] == -1) { // fix 2
                boolean isComp = checkBipartite(graph, v, visited);
                if (!isComp) {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }

    public static boolean checkBipartite(ArrayList<Edge>[] graph, int src, int[] vis) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + "", 0));

        while (!q.isEmpty()) {
            Pair top = q.poll();

            if (vis[top.v] != -1) {
                if (top.level != vis[top.v]) {
                    return false;
                }
            } else {
                vis[top.v] = top.level;
            }

            for (Edge e : graph[top.v]) {
                if (vis[e.nbr] == -1) {
                    q.add(new Pair(e.nbr, top.psf + e.nbr, top.level + 1));
                }
            }
        }
        return true;
    }
}
