package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFSinU_graph {

    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int v,int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        addEdge(adj,2,4);

        System.out.println("Following is Breadth First Traversal: ");
        BFS(adj,V,0);
    }

    public static void BFS(ArrayList<ArrayList<Integer>>adj,int V,int s){
        //V is number of vertex's

        boolean []visited = new boolean[V+1];

        ArrayDeque<Integer>queue = new ArrayDeque<>();

        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()){
           int q = queue.poll();
            System.out.print(q + " ");
            for (int ele : adj.get(q)){
                if(visited[ele]==false){
                    queue.add(ele);
                    visited[ele] = true;
                }
            }

        }
    }
}
