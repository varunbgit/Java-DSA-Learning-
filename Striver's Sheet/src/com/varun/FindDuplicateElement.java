package com.varun;
//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.HashSet;

public class FindDuplicateElement {

    public static void main(String[] args) {
        int []nums = {1,3,4,2,2};
//        int []nums = {3,1,3,4,2};
        int ans = findDuplicate2(nums);
//                findDuplicate(nums);
        System.out.println(ans);
}

    public static int findDuplicate(int[] nums) {
//        for (int i = 0; i <nums.length ; i++) {
//
//        }
        int i =  0;
        while(i < nums.length){
            if(nums[nums[i] -1] != nums[i] ){
                swap(nums,nums[i] -1,i);
                continue;
            }
            i++;
        }
        return nums[nums.length-1];
    }

    private static void swap(int []nums, int i, int num) {
        int temp = nums[i];
        nums[i] = nums[num];
        nums[num] = temp;
    }


    public static int findDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums){
            if(!set.contains(ele)){
                set.add(ele);
            }else{
                return ele;
            }
        }
        return 0;
    }
}
