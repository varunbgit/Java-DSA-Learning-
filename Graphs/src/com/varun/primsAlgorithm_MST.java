package com.varun;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsAlgorithm_MST {

    public  class Pair{
        int node ;
        int distance ;

        Pair(int distance,int node  ){
            this.distance = distance ;
            this.node = node;
        }
    }
    class Solution
    {
        static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
        {
            // Add your code here
            PriorityQueue<Pair> pq =  new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
            boolean[] visited = new boolean[V];

            pq.add(new Pair(0,0));
            int sum = 0;

            while(!pq.isEmpty()){
                int node = pq.peek().node;
                int wt =  pq.peek().distance;
                pq.poll();

                if(visited[node]){
                    continue;
                }
                visited[node] = true;
                sum += wt;

                for (int i = 0; i <adj.get(node).size() ; i++) {
                    int edwt = adj.get(node).get(i).get(1);
                    int adjNode = adj.get(node).get(i).get(0);

                    if(!visited[adjNode]){
                        pq.add(new Pair(edwt,adjNode));
                    }
                }
            }
            return sum;
        }
    }

}
