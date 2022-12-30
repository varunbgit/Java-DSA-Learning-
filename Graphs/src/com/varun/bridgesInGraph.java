package com.varun;

import java.util.*;

public class bridgesInGraph {
//    https://leetcode.com/problems/critical-connections-in-a-network/
public static void main(String[] args) {
    int no = 4;
    List<List<Integer>> connections = new ArrayList<List<Integer>>();
    connections.add(Arrays.asList(0,1));
    connections.add(Arrays.asList(1,2));
    connections.add(Arrays.asList(2,0));
    connections.add(Arrays.asList(1,3));
    List<List<Integer>> critical =  criticalConnections( no,  connections);
    System.out.println(critical.toString());
}
    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        //creating an adjacency list

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <n ; i++) {
            adj.add( new ArrayList<Integer>());
        }
        for(List<Integer> ls : connections){
            int u  = ls.get(0);
            int v = ls.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }


        List<List<Integer>> bridges  = new ArrayList<>();
        boolean [] visited = new boolean[n];
        int [] inTime = new int[n];
        int [] minTime = new int[n];
        int time = 1;
        DFS(n,adj,visited,0,-1,inTime,minTime, time,bridges);

         return bridges;
    }
    public static  void DFS(int no,ArrayList<ArrayList<Integer>> adj,boolean[] visited ,int s,int parent,
                    int[] inTime,int [] minTime,int time,List<List<Integer>>bridge)
    {
        visited[s] = true;

        inTime[s] = minTime[s] = time;
        time++;
        for (int ele : adj.get(s)){
            if (ele != parent) {
                if(!visited[ele]){
                    DFS(no,adj,visited,ele,s,inTime,minTime,time,bridge);
                    minTime[s] = Math.min(minTime[s],minTime[ele]);
                    //checking for bridge

                    if(minTime[ele] > inTime[s]){
                        //bridge found
                        bridge.add(Arrays.asList(ele,s));
                    }

                }else{
                    minTime[s] = Math.min(minTime[s],minTime[ele]);
                }
            }

        }



    }

}
