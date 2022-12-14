package com.varun;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int rotateIndex = 2;
        int [] ans = rotatearr(arr,rotateIndex);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rotatearr(int[] arr,int rotateIndex){
        rotateIndex  = rotateIndex%arr.length;  // here length of arr = 5 if rotation is by 6 then effective rotation is by 1 .
        int [] ans = new int[arr.length];

        for (int i = 0; i <arr.length-rotateIndex ; i++) {
            ans[i] = arr[i+rotateIndex];
        }

        for (int i = 0; i < rotateIndex; i++) {
            ans[i+rotateIndex+1]  = arr[i];
        }
        return ans;
    }
}
