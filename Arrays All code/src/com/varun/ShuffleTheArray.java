package com.varun;

import java.util.Arrays;

//1470. Shuffle the Array

public class ShuffleTheArray {
    public static void main(String[] args) {
        int []arr = {2,5,1,3,4,7};
        //output = 2,3,5,4,1,7;
        int n=3;
        int[] ansArr = Shuffle(arr,n);
        System.out.println(Arrays.toString(ansArr));
    }

    private static int[] Shuffle(int[] arr,int len) {
        int[] outputArr=new int [arr.length];

        int n=0;
        int k=0;
//        outputArr[0]=arr[0];
//        outputArr[1]= arr[1];

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                outputArr[i]=arr[n];
                n++;
            }else{
                outputArr[i]= arr[len+k];
                k++;
            }
        }
        return outputArr;
    }
}
