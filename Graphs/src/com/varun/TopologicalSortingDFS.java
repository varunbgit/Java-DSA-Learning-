package com.varun;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingDFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }


    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj, V);

    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <V ; i++) {
            if(visited[i]==false){
                DFS(adj,i,stack,visited);
            }
        }
        for (int ele : stack){
            System.out.print(ele + " ");
        }
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int s,Stack<Integer> stack, boolean[] visited) {
        visited[s] = true;

        for (int ele : adj.get(s)){
            if(visited[ele] ==false){
                DFS(adj,ele,stack,visited);
            }
        }
        stack.push(s);
    }
}