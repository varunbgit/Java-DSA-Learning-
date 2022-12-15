package com.varun;

public class MaxDiffBwElementsArray {
    public static void main(String[] args) {
        int [] arr = {2,3,10,6,4,8,1};
        int ans = maxDiff(arr);
        System.out.println(ans);

    }

    private static int maxDiff(int[] arr) {
        int maxDiff = arr[0] - arr[1];
        int minVal= arr[0];

        for (int j = 1; j <arr.length ; j++) {
            maxDiff = Math.max(maxDiff,arr[j] - minVal);
            minVal = Math.min(minVal,arr[j]);
        }
        return maxDiff;
    }
}
