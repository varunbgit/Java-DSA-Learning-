package com.varun;

import java.util.ArrayList;

public class NoOfIslands_DFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,3,4);

        System.out.println("Number of connected components: " + DFS(adj,V));
    }

    private static int  DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i])
                count++;
                DFSRec(adj, i, visited);
        }
        return count;
    }


    private static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
       // System.out.print(s + " ");

        for (int ele : adj.get(s)) {
            if (!visited[ele]) {
                DFSRec(adj, ele, visited);
            }
        }
    }

}
