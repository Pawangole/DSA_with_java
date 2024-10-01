package graph;


import java.util.*;

class creatGraph {
    // Adjacency List Representation using HashMap and LinkedList
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    // Function to add an edge to the graph
    public void addEdge(int u, int v, boolean direction) {
        // direction = false -> undirected graph
        // direction = true  -> directed graph
        
        // If the vertex 'u' is not present in the adjacency list, add it
        adjList.putIfAbsent(u, new LinkedList<>());
        adjList.get(u).add(v);

        if (!direction) {
            // Undirected graph, add an edge from 'v' to 'u'
            adjList.putIfAbsent(v, new LinkedList<>());
            adjList.get(v).add(u);
        }
    }

    // Function to print the adjacency list of the graph
    public void printAdjList(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            System.out.print("{ ");
            List<Integer> temp = adjList.getOrDefault(i, new LinkedList<>());
            for (int j : temp) {
                System.out.print(j + ", ");
            }
            System.out.println("}");
        }

        // Optionally, you can use the below code to iterate over the entire map
        // for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
        //     System.out.print(entry.getKey() + ": { ");
        //     for (int j : entry.getValue()) {
        //         System.out.print(j + ", ");
        //     }
        //     System.out.println("}");
        // }
    }

    public static void main(String[] args) {
        creatGraph g = new creatGraph();
        g.addEdge(0, 1, true);
        g.addEdge(0, 2, true);
        g.addEdge(1, 2, true);
        g.addEdge(2, 3, true);
        
        int n = 4; // number of nodes
        g.printAdjList(n);
    }
}
