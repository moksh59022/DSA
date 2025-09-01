package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src, nbr, wt;
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int v = 6; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        // Perform DFS-based topological sort
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topologicalSort(graph, i, visited, st);
            }
        }

        // Print result (popping stack gives topological order)
        System.out.println("Topological Order:");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph, int src, boolean[] visited, Stack<Integer> st) {
        visited[src] = true;
        for (Edge e : graph[src]) {
            if (!visited[e.nbr]) {
                topologicalSort(graph, e.nbr, visited, st);
            }
        }
        st.push(src);
    }
}
