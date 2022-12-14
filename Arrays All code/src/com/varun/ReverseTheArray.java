package com.varun;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
//        int [] arr = {10,5,7,9,8};
        int [] arr = {10,5,7,9,8,76};
//        int[] narr = new int[arr.length];
        int[] narr  = reverse(arr);

        System.out.println(Arrays.toString(narr));
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
        return arr;
    }
}
