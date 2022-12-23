package com.varun;

import java.util.ArrayList;

public class BaiscDefinationOfGraph {

    public static void addEdges(ArrayList<ArrayList<Integer>>adj,int v,int u)
    {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(5);
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdges(adj,0,1);
        addEdges(adj,0,2);
        addEdges(adj,1,2);
        addEdges(adj,1,3);

        printGraph(adj);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i <adj.size() ; i++) {
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}