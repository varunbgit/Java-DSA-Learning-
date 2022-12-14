package com.varun;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8};
        int largestIndex = findMax(arr);
        System.out.println(largestIndex);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
