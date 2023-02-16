package com.varun;

import java.util.HashMap;
import java.util.HashSet;

public class subaraysumequalk {
    public static void main(String[] args) {
        int [] arr = {0,0,0,0,0,0,0,0,0,0};
        int sum = 0;
        int ans =subarraySum(arr,sum);
        System.out.println(ans);
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);       //handle the edge case
        int sum = 0;
        for (int i = 0; i< nums.length ; i++) {
            sum += nums[i];
            if(map.containsKey(sum -k)){
                count += map.get(sum-k);
            }
            map.put(sum ,map.getOrDefault(sum  ,0)+1);
        }
        return count;
    }
}
