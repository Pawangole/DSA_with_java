package graph;

import java.util.*;

class TraverseGraph {
    // Adjacency List Representation using HashMap and LinkedList of pairs (for node and weight)
    private Map<Integer, List<Pair<Integer, Integer>>> adjList = new HashMap<>();

    // Helper class to store a pair of values (node, weight)
    class Pair<U, V> {
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int u, int v, int weight, boolean direction) {
        // direction = false -> undirected graph
        // direction = true  -> directed graph
        
        adjList.putIfAbsent(u, new LinkedList<>());
        adjList.get(u).add(new Pair<>(v, weight));

        if (!direction) {
            // For undirected graph, add reverse edge
            adjList.putIfAbsent(v, new LinkedList<>());
            adjList.get(v).add(new Pair<>(u, weight));
        }
    }

    // Function to print the adjacency list of the graph
    public void printAdjList(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            System.out.print("{ ");
            List<Pair<Integer, Integer>> temp = adjList.getOrDefault(i, new LinkedList<>());
            for (Pair<Integer, Integer> pair : temp) {
                System.out.print("(" + pair.first + "," + pair.second + "), ");
            }
            System.out.println("}");
        }
    }

    // BFS traversal of the graph
    public void bfsTraversal(int src) {
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Boolean> visited = new HashMap<>();

        // Initial state
        q.add(src);
        visited.put(src, true);

        while (!q.isEmpty()) {
            int frontNode = q.poll();
            System.out.print(frontNode + ", ");

            for (Pair<Integer, Integer> neighbour : adjList.getOrDefault(frontNode, new LinkedList<>())) {
                int node = neighbour.first;
                if (!visited.getOrDefault(node, false)) {
                    q.add(node);
                    visited.put(node, true);
                }
            }
        }
        System.out.println();
    }

    // Helper function for DFS traversal
    private void dfsHelper(int src, Map<Integer, Boolean> visited) {
        visited.put(src, true);
        System.out.print(src + ", ");

        // Fetch neighbors or return an empty list if none
        List<Pair<Integer, Integer>> neighbors = adjList.getOrDefault(src, new LinkedList<>());
        
        for (Pair<Integer, Integer> nbr : neighbors) {
            int node = nbr.first;
            if (!visited.getOrDefault(node, false)) {
                dfsHelper(node, visited);
            }
        }
    }

    // DFS traversal for disconnected graphs
    public void dfsTraversal(int n) {
        Map<Integer, Boolean> visited = new HashMap<>();

        for (int src = 0; src < n; src++) {
            if (!visited.getOrDefault(src, false)) {
                dfsHelper(src, visited);
            }
        }
    }

    public static void main(String[] args) {
        TraverseGraph g = new TraverseGraph();
        
        // Adding edges with weights
        g.addEdge(0, 3, 3, true);
        g.addEdge(0, 5, 3, true);
        g.addEdge(0, 2, 3, true);
        g.addEdge(2, 5, 3, true);
        g.addEdge(3, 5, 3, true);
        g.addEdge(5, 4, 3, true);
        g.addEdge(5, 6, 3, true);
        g.addEdge(4, 1, 3, true);
        g.addEdge(6, 1, 3, true);
        
        int n = 7;
        g.printAdjList(n);
        
        System.out.println("\nDFS: ");
        g.dfsTraversal(n);
        
        System.out.println("\nBFS starting from node 0: ");
        g.bfsTraversal(0);
    }
}
