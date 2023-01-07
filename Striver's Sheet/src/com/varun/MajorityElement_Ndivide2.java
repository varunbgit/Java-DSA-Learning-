package com.varun;

//https://leetcode.com/problems/majority-element/description/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_Ndivide2 {
    public static void main(String[] args) {
         int [] nums = {2,2,1,1,1,2,2};
         int ans = majorityElement(nums);
        System.out.println(ans );
    }

    //optimized Solution

    public int majorityElement2(int[] nums) {
        int max = nums[0];
        int count = 1;

        for(int i =1;i< nums.length;i++){
            if(max == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                max = nums[i];
                count = 1;
            }
        }
        return max;
    }


    public static  int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele , map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        System.out.println(map);
        int ans = -1;
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue() > nums.length/2){
                ans = en.getKey();
            }
        }
        return ans;
    }


}

