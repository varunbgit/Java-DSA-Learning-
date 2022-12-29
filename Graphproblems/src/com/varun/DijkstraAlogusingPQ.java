package com.varun;

import java.util.*;

public class DijkstraAlogusingPQ {
    public static class Pair{
        int distance;
        int node;

        Pair(int distance,int node){
            this.distance = distance;
            this.node = node;
        }
    }
    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {

        int []distance = new int[V];
        Arrays.fill(distance,(int) (1e9));
        distance[S] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance - y.distance);
        pq.add(new Pair(0,S));

        while(!pq.isEmpty()){
            int node = pq.peek().node;
            int prevdis = pq.peek().distance;
            pq.remove();


            for (int i = 0; i <adj.get(node).size() ; i++) {

                int edwt = adj.get(node).get(i).get(1);
                int adjNode  = adj.get(node).get(i).get(0);

                if(distance[adjNode] > prevdis + edwt){
                    distance[adjNode] = prevdis + edwt;
                    pq.add(new Pair(distance[adjNode],adjNode));
                }
            }
        }
        return distance;
    }
}
