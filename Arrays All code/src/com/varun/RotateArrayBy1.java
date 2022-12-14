package com.varun;

import java.util.Arrays;

public class RotateArrayBy1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int[] ans = rotatearrby1(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] rotatearrby1(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length ; i++) {
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        return temp;
    }
}
