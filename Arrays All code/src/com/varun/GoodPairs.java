package com.varun;

public class GoodPairs {
    public static void main(String[] args) {
        int [] arr= {1,2,3,1,1,3};
        int ans= numIdenticalPairs(arr);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
