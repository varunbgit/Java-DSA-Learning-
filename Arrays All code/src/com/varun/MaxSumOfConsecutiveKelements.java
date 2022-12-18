package com.varun;

public class MaxSumOfConsecutiveKelements {
    public static void main(String[] args) {
//        int []arr = {1,8,30,-5,20,7};
        int []arr = {10,5,-2,20,1};
        int k =3;
        int ansOp = maxSum1(arr,k);
        System.out.println(ansOp);
        int ansNa = maxSum(arr,k);
        System.out.println(ansNa);
    }

    private static int maxSum(int[] arr,int k) {
        int maxSum =Integer.MIN_VALUE;
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

    private static int maxSum1(int[] arr,int k) {
        //optimized approach
        int maxSum =Integer.MIN_VALUE;
        int lastIndex = 0;
        int index = 0;
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            if(index-lastIndex == k){
                maxSum = Math.max(maxSum,sum);
                sum=sum-arr[lastIndex];
                lastIndex++;
            }
            sum+=arr[i];
            index++;

        }
        return maxSum;
    }

}
