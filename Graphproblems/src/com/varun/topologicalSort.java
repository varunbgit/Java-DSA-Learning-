package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class topologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        boolean []visited= new boolean[V];
        int [] indegree = new int[V];

        for(int i=0;i<V;i++){
            for(int ele :adj.get(i) ){
                indegree[ele]++;
            }
        }
        // System.out.println(Arrays.toString(indegree));

        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<V;i++){

            if(indegree[i] == 0){
                visited[i] = true;
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            list.add(u);

            for(int v : adj.get(u)){

                indegree[v]--;

                if(indegree[v] ==0 ){
                    q.add(v);
                    visited[v] = true;
                }
            }
        }

        int[] ans = new int[V];
        for(int i =0;i<V;i++){
            ans[i] = list.get(i);
        }
        //   System.out.println(Arrays.toString(ans));
        return ans;
        // return new int[1];
    }
}
