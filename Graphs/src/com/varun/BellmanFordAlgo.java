package com.varun;
//https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=distance-from-the-source-bellman-ford-algorithm


import java.util.*;

public class BellmanFordAlgo {

    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {

        // Write your code here
        int[] distance = new int[V];
        Arrays.fill(distance,(int)(1e8));
        distance [S] = 0;

        for (int i = 0; i <=V; i++) {
            for (ArrayList<Integer> list : edges) {
                int src = list.get(0);
                int destt = list.get(1);
                int wt = list.get(2);
                if (distance[src]!=(int )(1e8) && distance[destt] > distance[src] + wt) {

                    if((distance[src]!= (int)(1e9)) && (i == V))
                        return new int[]{-1}; // detecting a negative cycle


                    distance[destt] = distance[src] + wt ;

                }
            }
        }
        return distance;

    }
}
