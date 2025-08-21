package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class Hamiltonian {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

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

        // start Hamiltonian path search from vertex 0
        hamiltonian(graph, 0, new HashSet<>(), "0", 0);
    }

    public static void hamiltonian(ArrayList<Edge>[] graph, int src, HashSet<Integer> visited, String psf, int originalSrc) {
        if (visited.size() == graph.length - 1) {
            // path covers all vertices
            System.out.print(psf);

            // check if it forms a cycle
            boolean cycle = false;
            for (Edge e : graph[src]) {
                if (e.nbr == originalSrc) {
                    cycle = true;
                    break;
                }
            }
            if (cycle) {
                System.out.println(" *"); // Hamiltonian cycle
            } else {
                System.out.println(" ."); // Hamiltonian path
            }
            return;
        }

        visited.add(src);

        for (Edge e : graph[src]) {
            if (!visited.contains(e.nbr)) {
                hamiltonian(graph, e.nbr, visited, psf + e.nbr, originalSrc);
            }
        }

        visited.remove(src); // backtrack
    }

    private static void addEdge(ArrayList<Edge>[] graph, int v1, int v2, int wt) {
        graph[v1].add(new Edge(v1, v2, wt));
        graph[v2].add(new Edge(v2, v1, wt)); // undirected
    }
}
