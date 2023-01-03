//package com.varun;
//
//import java.util.*;
//
//public class KosarajusAlgo_StronglyCoupledComponents {
//    public static void main(String[] args) {
//
//    }
//    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
//    {
//        //code here
//        boolean [] visited = new boolean[V];
//
//        Stack<Integer>st = new Stack<>();
//
//        //step1
//        for(int i= 0;i<V;i++){
//            if(!visited[i])
//            {
//                dfs(V,adj,st,i,visited);
//            }
//        }
//
//        //step2
//        ArrayList<ArrayList<Integer>> adjT  = new ArrayList<ArrayList<Integer>>();
//        for(int i =0;i<V;i++){
//            adjT.add(new ArrayList<Integer>());
//        }
//
//        for(int i=0;i<V;i++){
//            visited[i] = false;
//            for(int e : adj.get(i)){
//                adjT.get(e).add(i);
//            }
//        }
//
//        int scc = 0;
//
//        while(!st.isEmpty()){
//            int ele = st.pop();
//            if(!visited[ele]){
//                scc++;
//                dfs3(V,adjT,ele,visited);
//            }
//        }
//
//        return scc;
//    }
//    public void dfs3(int V,ArrayList<ArrayList<Integer>> adjT,int src,boolean[]visited){
//
//        visited[src] = true;
//
//        for(int ele : adjT.get(src)){
//            if(!visited[ele]){
//                dfs3(V,adjT,ele,visited);
//            }
//        }
//
//
//    }
//    public void dfs(int V,ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack,int src,boolean[]visited){
//        visited[src] = true;
//        for(int ele: adj.get(src)){
//            if(!visited[ele]){
//                dfs(V,adj,stack,ele,visited);
//            }
//
//        }
//        stack.push(src);
//
//    }
//}
