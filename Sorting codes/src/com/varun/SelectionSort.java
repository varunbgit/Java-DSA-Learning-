package com.varun;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {5,3,6,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int[] arr){
        //Run a for loop
        for(int i=0;i<arr.length;i++){
            int end  = arr.length-i-1;

            //Find the index of Largest ele and then swap it with the end index.
            int maxIndex = getmaxIndex(arr,0,end);

            //now swap the largest number index with the end index
            swap(arr, maxIndex,end);


        }
    }

    public static int getmaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=0;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void  swap (int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] =  arr[index2];
        arr[index2] = temp;
    }
}
