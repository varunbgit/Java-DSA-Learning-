package com.varun;
//Leetcode : https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfArray1 {
    public static void main(String[] args) {
        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};
        int[] ans = intersection(nums1,nums2);

        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        //insert all num1 values in HashMap with default key as 0;

        HashMap<Integer,Integer> map  = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],0);
        }
        //now check val of num2 array and if value present in map then increment its value by 1
        for (int i = 0; i < nums2.length ; i++) {
            if(map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i])+1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer,Integer> it:map.entrySet()){
            if (it.getValue()>0){
                ans.add(it.getKey());
            }
        }
            int [] ansArr  = new int[ans.size()];
        for (int i = 0; i <ans.size() ; i++) {
            ansArr[i]= ans.get(i);
        }
        return ansArr;
    }
}
