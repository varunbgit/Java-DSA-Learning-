package com.varun;

public class prefixSum {
    public static  int [] arr ={2,8,3,9,6,5,4};
    public static  int [] sumArr = new int[arr.length];
    public static void main(String[] args) {
        sumArr[0] = arr[0];
        for (int i = 1; i <sumArr.length ; i++) {
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        System.out.println(getSum(0,2));
        System.out.println(getSum(1,3));
        System.out.println(getSum(2,6));
        System.out.println(getSum1(0,2));
        System.out.println(getSum1(1,3));
        System.out.println(getSum1(2,6));

    }
    public static int getSum(int start, int end)
    {   //both start and end inclusive
        int sum =0;
        for (int i = start; i <=end ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static int getSum1(int start, int end){
        //o(1) operation
        if(start == 0){
            return sumArr[end];
        }
        int result = sumArr[end] - sumArr[start-1];
        return result;
    }

}
