package com.varun;

import java.util.ArrayList;

public class DetechCycleinDirectedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);

        if(DFS(adj,V)==true)
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V){
       boolean[] visited = new boolean[V];
       boolean[] recSt = new boolean[V];

        for (int i=0;i<V;i++){
            if(visited[i] == false){
                if(DFSRec(adj, i, visited,recSt) == true){
                    return true;
                }
            }

        }
        return false;
    }
    static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s,boolean[] visited ,boolean [] recSt ){
        visited[s] = true;
        recSt[s] = true;
        for(int ele : adj.get(s)){
            if(!visited[ele] && DFSRec(adj,ele,visited,recSt)){
                return true;
            }
            else if(recSt[ele] == true){
                return true;
            }
        }
        recSt[s] = false;
        return false;

    }
}
