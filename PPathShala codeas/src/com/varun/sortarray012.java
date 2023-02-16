package com.varun;

import java.util.Arrays;

public class sortarray012 {
    public static void main(String[] args) {
        int [] arr = {0 ,2 ,1 ,2, 0};
        sort012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int[] a, int n)
    {
        // code here
        int in = 1;
        int l = 0;
        int r = n-1;
        while(in < n){
            // System.out.println(in);
            if(a[in] == 0){
                // System.out.println(a[in]);
                swap(in,l,a);
                l++;
            }else if(a[in] == 2){
                // System.out.println(a[in]);
                swap(in,r,a);
                r--;
            }else{
                // System.out.println(a[in]);
                in++;
            }
        }
    }
    public static void swap(int a ,int b,int []arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
