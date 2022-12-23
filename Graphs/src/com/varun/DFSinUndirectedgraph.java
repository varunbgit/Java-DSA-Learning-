package com.varun;

import java.util.ArrayList;

public class DFSinUndirectedgraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal: ");
        DFS(adj,V,0);
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        DFSRec(adj,s,visited);
    }

    private static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        visited[s] = true;
        System.out.print(s + " ");
        for (int ele:adj.get(s)){
            if(!visited[ele])
                DFSRec(adj,ele,visited);
        }
    }
}