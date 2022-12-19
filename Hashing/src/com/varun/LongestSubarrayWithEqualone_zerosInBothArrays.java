package com.varun;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithEqualone_zerosInBothArrays {
    public static void main(String[] args) {
         int arr1[] = new int[]{0, 1, 0, 1, 1, 1, 1};
         int arr2[] = new int[]{1, 1, 1, 1, 1, 0, 1};
//        int arr1[] = new int[]{0,1,0,0,0,0};
//        int arr2[] = new int[]{1,0,1,0,0,1};
         int maxLenght = commonLength(arr1,arr2);
        System.out.println(maxLenght);

    }
    public static int commonLength(int[] arr1,int []arr2){
        int maxLen = 0;
        int[] finalarr = new int[arr1.length];

        for (int i = 0; i < arr1.length ; i++) {
            finalarr[i] = arr1[i] - arr2[i];
        }
        System.out.println(Arrays.toString(finalarr));

        HashMap<Integer,Integer>map = new HashMap<>();
        int sum =0;
        for (int i = 0; i <finalarr.length; i++) {
            sum += finalarr[i];
            if(sum==0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
