package com.varun;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {10,5,8,20};
        int ansIndex = secondHighest(arr);
        System.out.println(ansIndex);
    }

    private static int secondHighest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1 ;
        int secondMax = -1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max ){
                max = arr[i];
                secondMax = maxIndex;
                maxIndex = i;

            }
        }
        return secondMax;
    }
}
