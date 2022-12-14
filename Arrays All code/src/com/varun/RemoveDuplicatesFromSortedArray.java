package com.varun;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] arr = {10,20,20,30,30,30,30};
//        int size = 7;
        int[] arr = {20,20,20};
        int size = 3;
        int ans = removeduplicates(arr,size);
        for (int i = 0; i <ans ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static  int removeduplicates(int[]arr,int size){
        int index =1;
        int newSize =1;

        for (int i = 1; i <size ; i++) {
            if(arr[i]>arr[index-1]){
                arr[index] = arr[i];
                newSize++;
                index++;
            }
        }
        return newSize;
    }
}
