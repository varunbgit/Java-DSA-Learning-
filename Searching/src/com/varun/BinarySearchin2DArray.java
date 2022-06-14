package com.varun;

import java.util.Arrays;

public class BinarySearchin2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(BinarySearch2D(arr,37)));
    }

    public static int [] BinarySearch2D(int [][] arr,int target){
        int row=0 ;
        int col=arr[0].length -1;
        while(row< arr.length && col>=0){
            if(arr[row][col] == target){
                //element found
                return new int[]{row,col};
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }

        return new int []{-1,-1};
    }

}
