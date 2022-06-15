package com.varun;

import java.util.ArrayList;
import java.util.Arrays;

public class BSearch2DarraySortedFashion {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 10;
        System.out.println(Arrays.toString(Search(matrix,target)));
    }
    public static int [] Bsearch(int arr[][],int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cEnd + (cEnd-cStart)/2;
            if(arr[row][mid] == target ){
                return new int[]{row,mid};
            }
            if(arr[row][mid] > target ){
                cEnd = mid-1;
            }else{
                cStart = mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    public static int [] Search (int [] [] arr,int target){
        int rows = arr.length;
        int cols= arr[0].length;

//        int colStart = 0;
//        int colEnd = cols-1;
        int colMid = cols/2 ;
        int rowStart =0;
        int rowEnd =rows-1;
        //check if this is a 1D Array


        if(rows ==1 ){
            return Bsearch(arr,0,0,cols-1,target);
        }
        //reducing the rows to 2 .
         while(rowStart<(rowEnd -1)){  // this is true means more than 2 rows remaining
             //Binary search in the mid column

             int rowMid = (rowEnd+rowStart)/2;

             if(target ==arr[rowMid][colMid] ){
                 //ans found
                 return new int []{rowMid,colMid};
             }
             if(target > arr[rowMid][colMid]){
                 rowStart = rowMid;
             }else{
                 rowEnd = rowMid;
             }
         }

         // now only 2 rows are remaining

         //Remaining 2 rows are adjacent
            //check the middle column
            if(target == arr[rowStart][colMid]){ //checking the mid element of first row
                return new int[]{rowStart,colMid};
            }
            if(target == arr[rowStart+1][colMid]){ // checking the mid element of second row
                return new int[]{rowStart+1,colMid};
            }
            // element not found till now then search the remaining four parts

            //part1
            if(target <= arr[rowStart][colMid-1]){
                return Bsearch(arr,rowStart,0,colMid-1,target);
            }
            //part2
            if(target >= arr[rowStart][colMid+1] && target <= arr[rowStart][cols-1]) {
                return Bsearch(arr,rowStart,colMid+1,cols-1,target);
            }
            //part3
            if(target <= arr[rowStart+1][colMid -1]){
                return Bsearch(arr,rowStart+1,0,colMid-1,target);
            }
            //part4
            else{
                    return Bsearch(arr,rowStart+1,colMid+1,cols-1,target);
            }


    }


}
