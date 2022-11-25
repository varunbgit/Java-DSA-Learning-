package com.varun;
//https://leetcode.com/problems/maximum-subarray/submissions/849573850/?envType=study-plan&id=data-structure-i

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = maxSubArray(arr);
        System.out.println(sum);
    }
    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int ele :nums){
            max_ending_here += ele;
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
