package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeDFS {
        // Edge class to represent graph edges
        static class Edge {
            int src, nbr, wt;

            Edge(int src, int nbr, int wt) {
                this.src = src;
                this.nbr = nbr;
                this.wt = wt;
            }
        }

        // Pair class to store vertex and path so far
        static class Pair {
            int v;
            String psf;

            Pair(int v, String psf) {
                this.v = v;
                this.psf = psf;
            }
        }

        public static void main(String[] args) {
            int vtces = 7; // number of vertices
            ArrayList<Edge>[] graph = new ArrayList[vtces];

            // Initialize each adjacency list
            for (int i = 0; i < vtces; i++) {
                graph[i] = new ArrayList<>();
            }

            // Example edges (undirected graph)
            graph[0].add(new Edge(0, 1, 10));
            graph[1].add(new Edge(1, 0, 10));

            graph[0].add(new Edge(0, 3, 40));
            graph[3].add(new Edge(3, 0, 40));

            graph[1].add(new Edge(1, 2, 10));
            graph[2].add(new Edge(2, 1, 10));

            graph[2].add(new Edge(2, 3, 10));
            graph[3].add(new Edge(3, 2, 10));

            graph[3].add(new Edge(3, 4, 2));
            graph[4].add(new Edge(4, 3, 2));

            graph[4].add(new Edge(4, 5, 3));
            graph[5].add(new Edge(5, 4, 3));

            graph[5].add(new Edge(5, 6, 3));
            graph[6].add(new Edge(6, 5, 3));

            int src = 0; // starting vertex
            dfsIterative(graph, src, vtces);
        }

        public static void dfsIterative(ArrayList<Edge>[] graph, int src, int vtces) {
            boolean[] visited = new boolean[vtces];
            Stack<Pair> st = new Stack<>();
            st.push(new Pair(src, src + ""));

            while (st.size() > 0) {
                Pair rem = st.pop();

                if (visited[rem.v]) {
                    continue;
                }

                visited[rem.v] = true;
                System.out.println(rem.v + "@" + rem.psf);

                for (Edge e : graph[rem.v]) {
                    if (!visited[e.nbr]) {
                        st.push(new Pair(e.nbr, rem.psf + e.nbr));
                    }
                }
            }
        }
}
