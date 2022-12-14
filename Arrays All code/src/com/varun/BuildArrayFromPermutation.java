package com.varun;
import java.util.*;
// 1920. Build Array from Permutation

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {
        int[] outArr=new int [nums.length];
        for(int i =0;i< nums.length;i++){
            outArr[i] = nums[nums[i]];
        }

        return outArr;
    }
}