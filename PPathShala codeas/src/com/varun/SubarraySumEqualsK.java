package com.varun;

import java.util.HashSet;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int []arr = {-1,-1,1};
        int ans  =subarraySum(arr,0);
        System.out.println(ans);
    }

    public static int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum == k){
                count++;
            }
            else if(set.contains(Math.abs(sum - k ))){
                count++;
            }
                set.add(sum);

        }
        return count ;
    }
}
