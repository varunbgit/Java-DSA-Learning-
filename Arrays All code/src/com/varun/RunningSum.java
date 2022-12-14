package com.varun;

import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans=Sum(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] Sum(int[] arr){
        int [] outputArr=new int[arr.length];
       /// int temp=0;
        outputArr[0]=arr[0];
        for(int i =1;i<arr.length;i++){
//    Approach 1
//            temp+=arr[i];
//            outputArr[i]= temp;\
    //  Approach 2
            outputArr[i]= arr[i]+outputArr[i-1];
        }
        return outputArr;
    }
}
