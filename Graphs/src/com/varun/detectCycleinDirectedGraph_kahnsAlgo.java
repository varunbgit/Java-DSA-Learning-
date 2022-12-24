package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class detectCycleinDirectedGraph_kahnsAlgo {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)
    {
        int[] indegree = new int[V];

        for(ArrayList<Integer> lists : adj){
            for (int ele: lists){
                indegree[ele]++;
            }
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i <indegree.length ; i++) {
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        int count = 0;

        while(!queue.isEmpty()){
            int curr= queue.poll();
          //  System.out.print(curr + " ");
            count++;
            for (int ele : adj.get(curr)){
                if(indegree[ele] > 0)
                    indegree[ele]--;
                if(indegree[ele] == 0){
                    queue.add(ele);
                }
            }
        }
        if(count != V){
            System.out.println("Cycle exists");
        }
        else{
            System.out.println("No Cycle exists");
        }
    }
        public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 1);
        addEdge(adj,4, 1);
        addEdge(adj,1, 2);
        addEdge(adj,2, 3);
        addEdge(adj,3, 1);

        topologicalSort(adj,V);
    }
}