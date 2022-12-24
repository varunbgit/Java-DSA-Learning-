package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class KahnsAlgo_TopologicalSortingGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V){
        int [] indegree = new int[V];
        // two ways to calcuate indegrees arrays
        //if we have control over add edge function
        // we can simply add indegree[v]++

//        or else

        for(ArrayList<Integer> lists : adj){
            for (int ele: lists){
                indegree[ele]++;
            }
        }

        System.out.println(Arrays.toString(indegree));

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i <indegree.length ; i++) {
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int curr= queue.poll();
            System.out.print(curr + " ");

            for (int ele : adj.get(curr)){
                if(indegree[ele] > 0)
                    indegree[ele]--;
                if(indegree[ele] == 0){
                    queue.add(ele);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj,V);
    }

}
