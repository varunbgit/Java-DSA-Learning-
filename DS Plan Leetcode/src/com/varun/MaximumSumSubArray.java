package com.varun;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSubArray(arr);
    }
    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int ele :nums){
            max_ending_here += ele;
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }

        }
    }
}
