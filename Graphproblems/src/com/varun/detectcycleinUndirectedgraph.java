package com.varun;

import java.util.ArrayList;

public class detectcycleinUndirectedgraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i=0;i<V-1;i++){
            if(!visited[i]){
                if(DFSRec(V,adj,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;


    }
    public static boolean DFSRec(int V, ArrayList<ArrayList<Integer>> adj
            ,boolean[] visited,int s,int parent  ){

        visited[s] = true;

        for(int v : adj.get(s)){
            if(!visited[v]){
                if(DFSRec(V,adj,visited,v,s)){
                    return true;
                }
            }
            else{
                if(v!=parent)
                    return true;
            }
        }

        return false;

    }
}
