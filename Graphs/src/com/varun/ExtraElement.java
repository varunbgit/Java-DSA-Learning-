package com.varun;

import java.util.Arrays;

public class ExtraElement {
    public static void main(String[] args) {
        int[] nums = {2, 6, 8, 7, 4};
        int ans = findIndex(nums);
        System.out.println(ans);
    }


    public static int findIndex(int[] nums){
        //if first ele is  wrong
        Arrays.sort(nums);



        //CHECKING THAT WRONG ELEMENT IS AFTER FIRST TWO;
        int ans = -1;

        int diff1  = nums[1] - nums[0];
        int j  = -1;
        for (int i = 1; i < nums.length-1 ; i++) {

            if(ans<0) {
                j = i + 1;
            }
            if(nums[j] - nums[i] != diff1 ){
                if(ans>0){
                    return -1;
                }
                ans = nums[i+1];
                 j = i+2;
                 i--;

            }
        }


        int diff2  = nums[2] - nums[0];
        //second ele is wrong
        ans = nums[1];
        for (int i = 2; i < nums.length-1 ; i++) {
            if(nums[i] + diff2 != nums[i+1]){
                return -1;
            }
        }

        //first element is wrong
        ans = nums[0];
        int diff3  = nums[2] - nums[1];
        for (int i = 1; i < nums.length-1 ; i++) {
           if(nums[i] + diff3 != nums[i+1]){
               return -1;
           }
        }

        return ans ;

    }
}
