package com.varun;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // write your code here
        int [] arr = {3,1,5,4,2};
        BubbleSort(arr);
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
