package com.varun;


//https://leetcode.com/problems/subsets/description/

import java.util.ArrayList;
import java.util.List;

public class Subsets {


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ans =  subsets(nums);
        for (List<Integer> ls : ans){
            System.out.println(ls.toString());
        }
    }


    static List<List<Integer>> ans = new ArrayList<>() ;
    public static List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        rec(nums,ls,0);

        return ans;
    }

    public static void  rec(int[] nums ,ArrayList<Integer> ls,int i ){
        if( i == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }

        ls.add(nums[i]);
        rec(nums,ls,i+1);
        ls.remove(ls.size()-1);
        rec(nums,ls,i+1);
    }
}
