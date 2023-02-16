package com.varun;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Distanceofclosestzerotoeveryelement {
    public static void main(String[] args) {
        int []arr = {5,6,8,0,9,5,7,6,0,7,1,0};
        int[] ans = distance(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] distance(int[] n){
        int []ans  = new int[n.length];
        Arrays.fill(ans, -1);

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i <n.length ; i++) {
            q.add(n[i]);
        }












        return ans;
    }
//    public static int [] distance(int[] n){
//        int []ans  = new int[n.length];
//        Arrays.fill(ans, (int) (10e6));
//        for (int i = 1; i <ans.length ; i++) {
//
//            if(n[i] == 0){
//                ans[i] = 0;
//            }else{
//                ans[i] = ans[i-1] +1;
//            }
//        }
//
//        for (int i = ans.length -1; i >0 ; i--) {
//            if(ans[i] == 0){
//                ans[i] = 0;
//            }else{
//                ans[i] = Math.min( ans[i], ans[i-1] +1);
//            }
//        }
//        return ans;
//    }

}
