package com.varun;

import java.util.Stack;

public class pattern132 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        boolean ans = find132pattern(nums);
        System.out.println(ans);

    }
    public static boolean find132pattern(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        Stack<Integer> st = new Stack<>();
        boolean big = true;
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty()){

            }if(st.isEmpty()){
                st.push(nums[i]);
            }
        }
        return false;
    }
}
