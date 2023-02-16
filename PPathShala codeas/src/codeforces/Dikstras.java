//package codeforces;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//class pair{
//    int node;
//    int wt;
//    pair(int n,int w){
//        node = n;
//        wt = w;
//    }
//}
//class pairpq{
//    int node;
//    int distance;
//    pairpq(int n,int d){
//        node = n;
//        distance = d;
//    }
//}
//public class Dikstras {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
//        for(int i = 0;i<=n;i++){
//            adj.add(new ArrayList<>());
////            adj.get(i).add(new ArrayList<>());
//        }
////        for (int i = 0; i <n ; i++) {
////
////        }
//        int []distance = new int [n+1];
//        Arrays.fill(distance,(int)(1e9));
//        distance[1] = 0;
//
//        for (int i = 0; i <m ; i++) {
//            int u  = in.nextInt();
//            int v = in.nextInt();
//            int wt = in.nextInt();
//
//            adj.get(u).add(new pair(v,wt));
//        }
//        findDistance(adj,distance,1);
//        System.out.println(Arrays.toString(distance));
//        for (int i = 2; i <=n ; i++) {
//            System.out.print(distance[i] + " ");
//        }
//    }
//
//    private static void findDistance(ArrayList<ArrayList<pair>> adj, int[] distance, int i) {
//
//        PriorityQueue<pairpq> pq = new PriorityQueue<pairpq>((x,y)-> x.distance - y.distance);
//
//        pq.add(new pairpq(i,0));
//
//        while(!pq.isEmpty()){
//            pairpq curr = pq.poll();
//            int node = curr.node;
//            int dist = curr.distance;
//            for (pair p : adj.get(node)) {
//                int adjNode = p.node;
//                int wt = p.wt;
//                if(distance[adjNode] > distance[node] + wt){
//                    distance[adjNode] = distance[node] + wt;
//                    pq.add(new pairpq(adjNode,distance[adjNode]));
//                }
//            }
//        }
//    }
//
//}
