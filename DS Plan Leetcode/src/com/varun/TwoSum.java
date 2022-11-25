package com.varun;
//https://leetcode.com/problems/two-sum/description/?envType=study-plan&id=data-structure-i

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int sum =9;
        int [] ans =twoSum(arr,sum);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();


            for (int i = 0; i < nums.length; i++) {
                int find = target - nums[i];
                if (map.containsKey(find)) {
                    return new int[] { map.get(find), i };
                }
                map.put(nums[i], i);
            }
            // In case there is no solution, we'll just return null
            return null;

    }

}
