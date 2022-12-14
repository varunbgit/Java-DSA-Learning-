package com.varun;

import java.util.Arrays;

public class TotalNumberslessthan {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
            int[] outArr=new int [nums.length];
            for(int i=0;i<nums.length;i++){
                int count=0;
                //if(nums.length >1) {
                    for (int j = 0; j < nums.length; j++) {
                        if (i!=j  && nums[i] > nums[j]) {
                            count++;
                        }
                        outArr[i] = count;
                    }
                //}
            }
            return outArr;
    }

}
