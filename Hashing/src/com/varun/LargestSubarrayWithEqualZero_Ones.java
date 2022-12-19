package com.varun;

import java.util.Arrays;
import java.util.HashMap;

public class LargestSubarrayWithEqualZero_Ones {
    public static void main (String[] args) {
//        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int arr[] = new int[]{1,0,1,1,1,0,0};
        int len = arr.length;

        System.out.println(largestZeroSubarray(arr, len));
    }

    static int largestZeroSubarray(int arr[], int n)
    {
        int maxlen=0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <n ; i++) {
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            if(sum == 0){
                maxlen = i+1;
            }
            if(map.containsKey(sum)){
                maxlen = Math.max(maxlen,i- map.get(sum));
            }else{
                map.put(sum,i);
            }
        }

        return maxlen;
    }
}
