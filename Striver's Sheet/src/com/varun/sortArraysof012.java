package com.varun;

import java.util.Arrays;

public class sortArraysof012 {

    public static void main(String[] args) {
//        int [] nums = {1,2,0};
        int [] nums = {2,0,2,1,1,0};
//        sortColors2(nums);
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Naive Solution

    public static void sortColors2(int[] nums) {
        int n = nums.length;
        int red0 = 0;
        int white1 =  0;
        int green2 = 0 ;
        for(int ele : nums){
            if(ele == 0){
                red0++;
            }
            else if(ele == 1){
                white1++;
            }else {
                green2++;
            }
        }
        if(red0!=0){
            for (int i = 0; i <red0 ; i++) {
                nums[i] = 0;
            }
        }
        if(white1!=0){
            for (int i = 0; i <white1 ; i++) {
                nums[red0 + i ] = 1;
            }
        }
        if(green2 != 0){
            for (int i = 0; i < green2 ; i++) {
                nums[n-i-1] = 2;
            }
        }

    }



}
