package com.varun;

import java.util.Arrays;

public class DijistraAlgo {
    static final int V=4;
    public static void main(String[] args)
    {
        int graph[][] = new int[][] { { 0, 50, 100, 0},
                { 50, 0, 30, 200 },
                { 100, 30, 0, 20 },
                { 0, 200, 20, 0 },};

        for(int x: djikstra(graph,0)){
            System.out.print(x+" ");
        }

    }

    public static int[] djikstra(int graph[][], int src)
    {
        boolean[] finalized = new boolean[graph.length];
        int[] distance = new int[graph.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;

        for (int cnt = 0; cnt <V-1 ; cnt++) {
            int u = -1;

            for (int i = 0; i <V ; i++) {
                if (!finalized[i] && (u == -1 || distance[u] > distance[i])) {
                    u = i;
                }
            }
            finalized[u] = true;

            for (int v = 0; v <V ; v++) {
                if(!finalized[v] && graph[u][v]!=0){
                    distance[v] = Math.min(distance[v],distance[u] + graph[u][v]);
                }
            }

        }
        return distance;
    }

    }
