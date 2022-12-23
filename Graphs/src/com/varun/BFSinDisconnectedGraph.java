package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFSinDisconnectedGraph {

    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int v,int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
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
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);

        System.out.println("Following is Breadth First Traversal: ");
        BFSDin(adj,V);
    }

    private static void BFSDin(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean []visited = new boolean[v];

        for (int i = 0; i < visited.length ; i++) {
            if(!visited[i]){
                BFS(adj,i,visited);
            }
        }

    }

    public static void BFS(ArrayList<ArrayList<Integer>>adj,int s,boolean[] visited){
        //V is number of vertex's

       // boolean []visited = new boolean[V+1];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int q = queue.poll();

            System.out.print(q + " ");

            for (int ele : adj.get(q)){
                if(!visited[ele]){
                    queue.add(ele);
                    visited[ele] = true;
                }
            }

        }
    }
}
