package com.varun;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int key = 9;
        int ans  = search(nums,key);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }


    public static int helper(int[] nums, int target, int start, int end) {
        if(start>end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return helper(nums, target, start, mid -1);
        }else{
            return helper(nums,target,mid+1,end);
        }
    }
}
