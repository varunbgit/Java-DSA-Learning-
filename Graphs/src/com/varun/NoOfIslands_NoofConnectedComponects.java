package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class NoOfIslands_NoofConnectedComponects {

        static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
        {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        public static void main(String[] args)
        {
            int V = 7;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());

            addEdge(adj,0,1);
            addEdge(adj,0,2);
            addEdge(adj,2,3);
            addEdge(adj,1,3);
            addEdge(adj,4,5);
            addEdge(adj,5,6);
            addEdge(adj,4,6);

            System.out.print("Number of islands: "+BFSDin(adj,V));
        }

    private static int  BFSDin(ArrayList<ArrayList<Integer>> adj, int v) {
            boolean[] visited = new boolean[v];
            int count = 0;
        for (int i = 0; i <v ; i++) {
            if(!visited[i]){
                count++;
                BFS(adj,i,visited);
            }
        }
        return count;
    }
    private static void  BFS(ArrayList<ArrayList<Integer>> adj, int s,boolean [] visited){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[s]  = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int  u = queue.poll();
            for (int v : adj.get(u)){
                if(!visited [v]){
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }

}
