package com.varun.DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int [] h = {2 ,1 ,4 ,9};
        int n = h.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);

//        int ans = Sum(h,n-1,dp);
        int ans = Sum2(h,n,dp);
        System.out.println(Arrays.toString(dp));
        System.out.println(ans);
    }
    //tabulation
    public static int Sum2(int[] nums, int n,int[]dp ) {
        if(n  ==1 ){
            return nums[0];
        }
        int prev_prev = nums[0];
        int prev = Math.max(nums[0],nums[1]);

        for (int i = 2; i <n ; i++) {
            int curr = Math.max(prev_prev + nums[i] , prev);
            prev_prev = prev ;
            prev = curr;
        }
        return prev;


//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0],nums[1]);
//
//        for (int i = 2; i <n ; i++) {
//            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i]);
//        }
//
//        return dp[n-1];
    }
    public static int Sum(int[] nums, int n,int[]dp ) {
       if(n==0){
           return nums[0];
       }
       if(n<0){
           return 0;
       }
       if(dp[n]!= -1){
           return dp[n];
       }
       int pick = nums[n] + Sum(nums,n-2,dp);
       int notpick = Sum(nums, n - 1,dp);

       return dp[n] = Math.max(pick,notpick);

    }
}
