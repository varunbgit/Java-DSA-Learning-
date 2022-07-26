package com.varun;
//https://www.geeksforgeeks.org/sum-triangle-from-array/
import java.util.Arrays;

public class SumofLevelInTraingle {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        sumPrint(arr);

    }
    public static void sumPrint(int []arr){
        if(arr.length ==1){
            return ;
        }


        int [] sumArray = new int [arr.length -1];
        for (int i = 0; i < arr.length-1 ; i++) {
            sumArray[i] = arr[i] + arr[i+1];
        }
        sumPrint(sumArray);

        System.out.println(Arrays.toString(sumArray));


    }
}
