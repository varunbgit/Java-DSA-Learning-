package com.varun.DynamicProgramming;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
//        int n = 8;
//        int [] heights = {7 ,4 ,4 ,2 ,6 ,6 ,3 ,4 };
        int n = 3;
        int [] heights = {7 ,4 ,5 };
        dp = new int[n +1];
        Arrays.fill(dp,-1);
//        dp[0] = 0;
        int ans = frog(n-1,heights);
        int ans2 =frogTable(n,heights);
        System.out.println(ans2);
//        System.out.println(ans);

    }
    static int [] dp ;

    private static int frogTable(int n, int[] heights) {

        int prev_prev = 0;
        int prev = Math.abs(heights[0] -heights[1]);
        int curr = 0;
        for (int i = 2; i <n ; i++) {
            int fs = prev + Math.abs(heights[i] -heights[i-1]);
            int ss =Integer.MAX_VALUE;
//            if(i >1){
                ss = prev_prev +  Math.abs(heights[i] - heights[i-2]);

            curr = Math.min(fs,ss);
            prev_prev = prev;
            prev = curr;
        }

        return curr;




//        dp[0] = 0;
//
//
//        for (int i = 1; i < n; i++){
//            int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
//            int ss = Integer.MAX_VALUE;
//            if(i>1){
//                ss  =  dp[i-2] + Math.abs(heights[i] - heights[i-1]);
//            }
//            dp[i] = Math.min(fs,ss);
//        }
//        return dp[n-1];
    }

            private static int frog(int n, int[] heights) {

        dp[0] = 0;
        dp[1] = Math.abs(heights[0] - heights[1]);

//        for(int i =2;i<n;i++)


return 0;




//        if( n== 0){
//            return 0;
//        }
//        if(dp[n ]!= -1){
//            return dp[n];
//        }
//        int e1 = frog(n-1,heights) + Math.abs(heights[n] - heights[n-1]);
//        int e2 = Integer.MAX_VALUE;
//        if(n>1){
//            e2 = frog(n-2,heights) + Math.abs(heights[n] - heights[n-2]);
//        }
//        dp[n] = Math.min(e1,e2);
//
//        return dp[n];


//        int e1 = Integer.MAX_VALUE;
//        int e2 = Integer.MAX_VALUE;
//        if(dp[n-1]!=-1){
//            e1 =  dp[n-1]  + Math.abs(heights[n] - heights[n-1]);
//        }else{
//            e1 = frog(n-1,heights) + Math.abs(heights[n] - heights[n-1]);
//        }
//        if(n > 1){
//            if (dp[n - 2] != -1) {
//                ne2 = dp[n - 2] + Math.abs(heights[n] - heights[n-2]);
//            } else {
//                e2 = frog(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);
//            }
//        }
//        dp[n] =  Math.min(e1,e2);
//        return dp[n];
    }
}
