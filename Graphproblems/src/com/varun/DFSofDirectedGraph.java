package com.varun;

import java.util.ArrayList;

public class DFSofDirectedGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean [V];
        ArrayList<Integer>ans = new ArrayList<Integer>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfsRecOfGraph(V,adj,visited,i,ans);
            }
        }
        return ans;

    }




    public ArrayList<Integer> dfsRecOfGraph(int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                                            int s, ArrayList<Integer>ans){

        visited[s] = true;
        ans.add(s);
        for(int v : adj.get(s)){
            if(!visited[v]){
                dfsRecOfGraph(V,adj,visited,v,ans);
            }
        }
        return ans ;
    }

}
