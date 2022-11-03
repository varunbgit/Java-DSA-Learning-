package com.varun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctEle {

    public static void main(String[] args) {
        Integer[] arr = {1 ,1 ,2 ,2 ,3 ,3 ,4 ,5 ,6 ,7};
        int ans = countNonRepeated(arr);
        System.out.println(ans);
    }
    public static int countNonRepeated(Integer arr[])
    {
//        // add your code
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i <arr.length ; i++) {
//            set.add(arr[i]);
//        }
//
//        return set.size();

        // Approach 2 more Improvised
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        // just remember for using it as constructor you must use Wrapper Class Integer instead of int

        return set.size();
    }

}
