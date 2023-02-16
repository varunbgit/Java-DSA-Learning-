package com.varun;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[]nums = {-2,0,1,1,2} ;
        List<List<Integer>> ans  = threeSum(nums);
        System.out.println(ans.toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();

        int target = 0;
        int s = 0;

        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n;i++ ){
            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                }else if(sum > target ){
                    k --;
                }else{
                    j++;
                }
            }

        }
        return  ans.stream().toList() ;


    }
}
