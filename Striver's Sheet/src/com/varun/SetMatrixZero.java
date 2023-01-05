package com.varun;

//https://leetcode.com/problems/set-matrix-zeroes/

import java.util.HashSet;

public class SetMatrixZero {
    public static void main(String[] args) {
     int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
     setZeroes(matrix);

//     printing the output

     for (int i = 0; i < matrix.length ; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
             System.out.print(matrix[i][j]  + " -> ");
         }
         System.out.println();
     }

    }

    public static void setZeroes(int[][] matrix) {

        HashSet <Integer> col = new HashSet<>();

        for (int i = 0; i < matrix.length ; i++) {
            boolean rowzero = false;

            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] == 0){
                    col.add(j);
                    rowzero = true;
                }

            }
            //make whole row / array == 0 ;
            if(rowzero){
                for (int j = 0; j < matrix[i].length ; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int c : col ){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c]  = 0;
            }
        }
    }

}
