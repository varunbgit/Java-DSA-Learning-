package com.varun;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>>  ans = subsets(nums);
        for (int i = 0; i <ans.size() ; i++) {
            for (int ele : ans.get(i)){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> ls= new ArrayList();

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        rec(nums,0,temp );
        return ls;
    }
    public static void rec (int[] nums,int n,List<Integer> list){

        if(n >= nums.length){
            System.out.println(list.toString());

            return;
        }

//        rec(nums,n+1,list);
        list.add(nums[n]);
        rec(nums,n+1,list);
        int removed  = list.remove(list.size()-1);

//        list.remove(0);
        rec(nums,n+1,list);

    }
}
