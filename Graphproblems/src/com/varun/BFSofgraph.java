package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSofgraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean [] visited = new boolean[V];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        visited[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()){
            int u = queue.poll();
            // System.out.print(u + "->");
            ans.add(u);

            for(int v:adj.get(u)){
                if(!visited[v]){
                    queue.add(v);
                    visited[v] =true;
                }
            }
        }

        return ans;

    }
}
