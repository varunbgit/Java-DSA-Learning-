package com.varun;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,7,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        int  len = arr.length;
        for(int i= 0;i<len-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1] == arr[j]){
                    break;      //lhs is already sorted so no need to check again
                }
                if(arr[j-1] > arr[j]){  //swapping the RHS & LHS
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
