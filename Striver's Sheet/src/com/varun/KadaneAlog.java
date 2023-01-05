package com.varun;

public class KadaneAlog {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubarraySum(nums);
        System.out.println(ans);
    }

    private static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int ele : nums){
            currSum += ele;

            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
