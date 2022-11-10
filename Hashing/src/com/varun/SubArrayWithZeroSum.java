package com.varun;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {-3,4,-3,-1,1};
        System.out.println(sum0exist(arr));
    }
    public static boolean sum0exist(int[] arr){
//        ***Naive Solution***
//        each ele acts a staring of a subset for a set
        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            for(int j = i;j< arr.length;j++){
                sum = sum + arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    
//        ***Optimized solution***
//        HashSet<Integer> set  = new HashSet<Integer>();
//        int sum = 0;
//        for(int ele:arr){
//            sum = sum + ele;
//            if(set.contains(sum)){
//                return true;
//            }
//            set.add(sum);
//        }
//        return false;
    }
}
