package com.varun;

import java.util.Arrays;

public class CyclicalyRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr  =  {1, 2, 3, 4, 5};
        int n = 5;
        rotate(arr,n);
    }
    public static  void rotate(int arr[], int n)
    {
        int lastEle = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
          //  int temp  = arr[i];
            arr[i+1] = arr[i];
//            arr[i-1] = temp;
        }
        arr[0] = lastEle;

        System.out.println(Arrays.toString(arr));
    }

}
