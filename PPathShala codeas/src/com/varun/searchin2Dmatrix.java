package com.varun;

public class searchin2Dmatrix {
    public static void main(String[] args) {
        int[][]matrix = {{1}};
        System.out.println(searchMatrix(matrix,2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int row = 0;
        int col = c-1;
        while(row < r  && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] < target){
                row++;

            }
            else if(matrix[row][col] > target){
                col--;
            }
        }
        return false;
    }

}
