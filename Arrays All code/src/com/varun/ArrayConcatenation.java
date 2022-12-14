package com.varun;

import java.lang.reflect.Array;
import java.util.Arrays;

// Leetcode 1929. Concatenation of Array
public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] inputArr = {1,2,1};
       // System.out.println("The Concatenated Array is "+ Concatenate(inputArr));
        int[] outArr=new int [2*inputArr.length];

        for (int i=0;i<2*(inputArr.length);i++){

            if(i<inputArr.length){
                outArr[i]=inputArr[i];

            }else{
                outArr[i]=inputArr[i-inputArr.length];
            }
        }
        System.out.println("The Concatenated Array is "+ Arrays.toString(outArr));


    }
//    public static int [] Concatenate(int [] arr){
//
//
//
//
//        return outArr;
//    }
}
