package com.varun;
//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

public class Find_MIn_Max {
    public static void main(String[] args) {
        int []arr = {1, 4, 3, -5, -4, 8, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        find(arr,0,max,min);
    }

    public static void find(int [] arr ,int sIndex,int max,int min){
        if(sIndex==arr.length){
            System.out.println("Min is : " + min + " max is : " + max);
            return;
        }
        if(arr[sIndex] > max){
            max = arr[sIndex];
        }
        if(arr[sIndex] < min){
            min = arr[sIndex];
        }
        sIndex++;
       find(arr,sIndex,max,min);
       return;
    }
}
