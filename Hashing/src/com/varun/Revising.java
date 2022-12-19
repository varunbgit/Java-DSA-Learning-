//package com.varun;
//
////largest subarray with given Sum
//
//import java.util.HashMap;
//
//public class Revising {
//    public static void main(String[] args) {
////        int [] arr = {8,3,1,5,-6,6,2,2};
//        int [] arr = {1,0,1,1,1,0,0};
//        int sum = 0;
//        int ans = findMaxLen(arr,sum);
//        System.out.println(ans);
//    }
//
//    private static int findMaxLen(int[] arr, int sum) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int arrsum = 0;
//        int len = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            arrsum += arr[i];
//
//            if(!map.containsKey(arrsum))
//                map.put(arrsum,i);
//
//            if(map.containsKey(arrsum-sum)){
//                len = Math.max(len,i-map.get(arrsum-sum));
//               // System.out.println(len);
//            }
//
//        }
//        return len;
//    }
//}

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
//        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int arr[] = new int[]{1,0,1,1,1,0,0};
        int len = arr.length;

        System.out.println(largestZeroSubarray(arr, len));
    }

    static int largestZeroSubarray(int arr[], int n)
    {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
                maxLen = i+1;

            if(hm.containsKey(sum) == true)
            {
                if(maxLen < i - hm.get(sum ))
                    maxLen = i - hm.get(sum );

            }else hm.put(sum , i);
            System.out.println(hm);
        }
        return maxLen;
    }
}