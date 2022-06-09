package com.varun;

//167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 13;
        int [] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans  = new int [2];
        int start=0;
        int end = numbers.length -1;
        while (start <end){
            if(numbers[start] + numbers[end]  == target){
                ans[0] = start+1;
                ans [1]= end+1;
                return ans;
            }
            if(numbers[start] + numbers[end]  > target){
                end --;
            }
            else{
                start++;
            }
        }
        ans [0] = -1;
        ans [1] = -1;
        return ans ;
    }
}
