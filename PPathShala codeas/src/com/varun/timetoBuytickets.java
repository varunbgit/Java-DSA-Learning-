package com.varun;

import java.util.ArrayDeque;
import java.util.Queue;



public class timetoBuytickets {

    public static void main(String[] args) {
        int t[] = {2, 3, 2};
        int k = 2;
        int ans = timeRequiredToBuy(t, k);
        System.out.println(ans);
    }

//    public static int timeRequiredToBuy(int[] t, int k) {
//        Queue<pair> q = new ArrayDeque<>();
//        int tm = 0;
//        for (int i = 0; i < t.length; i++) {
//            q.add(new pair(t[i], i));
//        }
//
//        while (q.size() > 1) {
//            tm += q.size() - 1;
//
//        }
//            return tm;
//
//
//
//    }

    public static int timeRequiredToBuy(int[] a, int k) {
        int time = 0;
        for(int i =0;i<a.length;i++){
            if(i<=k){
                time += Math.min(a[k],a[i]);
            }
            else{
                time += Math.min(a[k]-1,a[i]);
            }
        }
        return time;
    }
}
