package com.varun;

import java.util.Arrays;

public class Remove0toLast {
    public static void main(String[] args) {
//        int[] arr = {8,5,0,10,0,20};
        int[] arr = {0,0,0,0,10,0};
        int[] ans  = move0tolast(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] move0tolast(int [] arr){
        int [] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }
        return temp;
    }
}
