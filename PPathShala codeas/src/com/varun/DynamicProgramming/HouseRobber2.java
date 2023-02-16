package com.varun.DynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        int[] nums = {2,3,2};
        int[] nums = {1,2,3};
//        int[] nums = {200,3,140,20,10};

        int ans = rob(nums);
        System.out.println(ans);
    }
    public static int rob(int []nums){
        int n = nums.length;
//        Arrays.co
        int []dp = new int[n];
        Arrays.fill(dp,-1);
        int ans1 = sum2((Arrays.copyOfRange(nums,0,nums.length-1)),n-2,dp);
        Arrays.fill(dp,-1);
        int ans2 = sum2(Arrays.copyOfRange(nums,1,nums.length),n-2,dp);
        return Math.max(ans1,ans2);
    }

    //tabulation
    public static int sum3 (int[] nums,int n,int []dp ) {





    }

    //memoization
    public static int sum2 (int[] nums,int n,int []dp ){
        if(n == 0){
            return nums[0];
        }
        if(n <0){
            return 0;
        }

        if(dp[n]!= -1){
            return dp[n];
        }
        int pick = nums[n] + sum2(nums,n-2,dp);
        int notpick = sum2(nums,n-1,dp);
        return dp[n] = Math.max(pick,notpick);
    }


    public static int sum (int[] nums,int n ){
        if(n== 0){
            return nums[0];
        }
        if(n <0){
            return 0;
        }

        int pick = nums[n] + sum(nums,n-2);
        int  notpick = sum(nums,n-1);

        return Math.max(pick,notpick);
    }

}

