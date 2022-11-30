package com.varun;

import java.util.ArrayDeque;

public class MaxmimumInAllSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {10,8,5,12,15,7,6};
        int k =3;
        findMaxInSubArray(arr,k);
    }

    private static void findMaxInSubArray(int[] arr, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int size =0;
        int i=0;
        int max = Integer.MIN_VALUE;
        while(i< arr.length){

            while (size<k){
                if(arr[i]>max){
                    max = arr[i];
                }
                queue.addFirst(arr[i]);
                i++;
                size++;
            }
            System.out.print(max + " -> ") ;

            //remove one element
            queue.removeFirst();
            size--;


        }
    }
}
