package com.varun;

public class removeduplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    public static void removeDuplicates(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i + 1];
        }

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
//        return;
    }
}
