package com.varun;

import java.util.Arrays;

public class lc747 {

    public static void main(String[] args) {
        int [] nums = {3,6,1,0} ;
        int ans = dominantIndex(nums) ;
        System.out.println(ans);
    }
    public static int dominantIndex(int[] nums) {
        int maxIn = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max ){
                maxIn = i;
                max = nums[i];
            }
        }

        Arrays.sort(nums);
        for(int i =0;i<nums.length -1;i++){
            if(!(2* nums[i] <= nums[nums.length -1]) ){
                return -1;
            }
        }
        return maxIn;

    }
}
