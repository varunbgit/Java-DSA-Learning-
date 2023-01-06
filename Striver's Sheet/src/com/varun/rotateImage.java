package com.varun;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/
public class rotateImage {
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}} ;
        rotate(matrix);
        for(int [] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

            }
        }
        // transpose of matrix done

        //reverse the rows
        for(int []arr :matrix){
            for (int i = 0; i <arr.length/2 ; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
        }
    }

}
