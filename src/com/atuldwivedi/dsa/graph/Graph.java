package com.atuldwivedi.dsa.graph;

public class Graph {
    int V, E;
    Edge[] edges;

    class Edge {
        public int src, dest;
    }

    public Graph(int v, int e) {
        this.V = v;
        this.E = e;
        edges = new Edge[E];

        for (int i = 0; i < E; i++) {
            edges[i] = new Edge();
        }
    }

    public int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

    public void union(int[] parent, int x, int y) {
        int repx = find(parent, x);
        int repy = find(parent, y);

        parent[repx] = repy;
    }

    public boolean detectCycle(Graph g) {
        int[] parent = new int[g.V];

        for (int i = 0; i < g.V; i++) {
            parent[i] = -1;
        }

        for (int i = 0; i < g.E; i++) {
            int repSrc = g.find(parent, g.edges[i].src);
            int repDest = g.find(parent, g.edges[i].dest);

            if (repSrc == repDest) {
                return true;
            }

            g.union(parent, repSrc, repDest);
        }
        return false;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Graph g = new Graph(4, 3);
        g.edges[0].src = 0;
        g.edges[0].dest = 1;

        g.edges[1].src = 1;
        g.edges[1].dest = 2;

        g.edges[2].src = 0;
        g.edges[2].dest = 3;

        System.out.println(g.detectCycle(g));
    }
}
