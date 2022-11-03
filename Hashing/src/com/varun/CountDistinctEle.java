package com.varun;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctEle {

    public static void main(String[] args) {
        int[] arr = {1 ,1 ,2 ,2 ,3 ,3 ,4 ,5 ,6 ,7};
        int ans = countNonRepeated(arr);
        System.out.println(ans);
    }
    public static int countNonRepeated(int arr[])
    {
        // add your code
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }

        return set.size();

    }

}
