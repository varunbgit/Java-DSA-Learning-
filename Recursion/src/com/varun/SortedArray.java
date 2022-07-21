package com.varun;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,45,6,9,23,43,72};
        boolean ans = isSorted(arr,0);
        System.out.println(ans);
    }
    static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }

        return  arr[index] < arr[index + 1] && isSorted(arr,index + 1) ;
    }
}
