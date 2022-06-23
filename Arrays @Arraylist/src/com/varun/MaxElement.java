package com.varun;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,4,6,35,76,87,97,101};
        MaxEle(arr);
        MinEle(arr);
    }
    public static void MaxEle(int[] arr){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        System.out.println("Max element is "+ min);
    }

    public static void MinEle(int[] arr){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("Min Element is "+max);
    }
}
