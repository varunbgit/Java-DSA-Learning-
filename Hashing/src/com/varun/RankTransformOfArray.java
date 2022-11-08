package com.varun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
   //     int[] arr = {40,10,20,30};
        int[] ans  = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static  int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        Arrays.sort(temp);


        for(int ele:temp){
            map.putIfAbsent(ele, map.size()+1);
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;













//        int[] temp = new int[arr.length];
//        System.arraycopy(arr, 0, temp, 0, arr.length);
//        Arrays.sort(temp);
//        int []ans = new int[arr.length];
//
//
//        for (int i = 0; i<arr.length ; i++) {
//            int count = 1;
//            for (int j = 0; temp[j]!=arr[i] ; j++) {
//               if(arr[i]>temp[j]){
//                   count++;
//               }
//            }
//            ans[i] = count;
//        }


//        return ans;



    }
}
