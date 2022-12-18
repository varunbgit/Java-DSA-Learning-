package com.varun;

public class MaxSumOfConsecutiveKelements {
    public static void main(String[] args) {
        int []arr = {1,8,30,-5,20,7};
        int k =3;
        int ans = maxSum(arr,k);
        System.out.println(ans);
    }

    private static int maxSum(int[] arr,int k) {
        int maxSum =0;
        for (int i = 0; i <arr.length-k; i++) {
            int sum = 0;
            for (int j = i; j <i+k ; j++) {
                sum= sum + arr[j];
            }
           // System.out.println(sum);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
