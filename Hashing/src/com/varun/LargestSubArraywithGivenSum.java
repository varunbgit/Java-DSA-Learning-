package com.varun;

import java.util.HashMap;

public class LargestSubArraywithGivenSum {
    public static void main(String[] args) {
        int [] arr = {8,3,1,5,-6,6,2,2};
        int sum = 4;
        int ans = find(arr,sum);
        System.out.println(ans);
    }

    public static int find(int[] arr,int sum) {
        int add =0 ;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <arr.length ; i++) {
            add +=arr[i];

            if(!map.containsKey(add)){
                map.put(add,i);
            }
            if (add == sum) {

                return i+1; // to handle the edge case where you have the first n ele added to get the sum;
            }
            if(map.containsKey(add - sum)){
//                int prevVal =  map.get(add-sum);
//                int currVal = ;
                max = Math.max(max ,i-map.get(add-sum) );
            }

        }
        return max;
    }
}
