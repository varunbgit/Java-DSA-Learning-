package com.varun;

public class prefixSum {
    public static  int [] arr ={2,8,3,9,6,5,4};

    public static void main(String[] args) {
        System.out.println(getSum(0,2));
        System.out.println(getSum(1,3));
        System.out.println(getSum(2,6));

    }
    public static int getSum(int start, int end)
    {   //both start and end inclusive
        int sum =0;
        for (int i = start; i <=end ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
