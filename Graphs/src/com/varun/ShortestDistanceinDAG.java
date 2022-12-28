package com.varun;

import java.io.IOException;
import java.util.*;
import java.util.Arrays;
import java.util.Stack;

public class ShortestDistanceinDAG {
    //{ Driver Code Starts


    class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] edge = new int[m][3];
                for (int i = 0; i < m; i++) {
                    edge[i][0] = sc.nextInt();
                    edge[i][1] = sc.nextInt();
                    edge[i][2] = sc.nextInt();
                }
                Solution obj = new Solution();
                int res[] = obj.shortestPath(n, m,edge);
                for (int i = 0; i < n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            }
        }
    }
// } Driver Code Ends


    //User function Template for Java
    class Solution {

        public int[] shortestPath(int N,int M, int[][] edges) {
            //Code here
            int V = N;
            //creating a Adjacency list;
            ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<Pair>());
            }

            for (int i = 0; i <M ; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                int w = edges[i][2];

                adj.get(u).add(new Pair(v,w));
            }

            int s = 0;
            boolean [] visited = new boolean[V];
            Stack<Integer> st = new Stack<>();
            // toposort
            //using DFS

            for (int i = 0; i <V ; i++) {
                if(!visited[i]){
                    toposort(adj,V,st,visited,i);
                }
            }

            int [] distance = new int[V];
            Arrays.fill(distance,Integer.MAX_VALUE);
            distance[s] =0;
            //System.out.println(Arrays.toString(distance));

            while(!st.isEmpty()){
                int u = st.peek();
                st.pop();

                for(Pair v : adj.get(u)){
                    if(distance[v.first] != Integer.MAX_VALUE || distance[u] != Integer.MAX_VALUE ){
                        if(distance[v.first] > distance[u] + v.second){
                            distance[v.first] = distance[u] + v.second ;
                        }
                    }

                }
            }

            //    DFSRec(adj,V,visited,distance,s,st);

            for(int i =0 ;i<distance.length;i++){
                if(distance[i] == Integer.MAX_VALUE){
                    distance[i] = -1;
                }
            }
            //System.out.println(Arrays.toString(distance));
            return distance;
        }

        public class Pair{

            int first ;
            int second ;

            Pair(int v,int w){

                this.first = v;
                this.second = w;

            }
        }

        private void toposort(ArrayList<ArrayList<Pair>> adj, int V, Stack<Integer> st, boolean[] visited, int s) {
            visited[s] = true;

            for (Pair v : adj.get(s)){
                if(!visited[v.first]){
                    toposort(adj,V,st,visited,v.first);
                }
            }
            st.push(s);
        }


    }
}
