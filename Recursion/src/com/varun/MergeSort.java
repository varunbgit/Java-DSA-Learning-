package com.varun;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,3,1,4,7};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int [] arr ){

        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
//        int []left = new int[mid];
//        int [] right= new int[arr.length-mid];


        int [] left = Arrays.copyOfRange(arr,0,mid);
        int [] right = Arrays.copyOfRange(arr,mid,arr.length);

        int []first = sort(left);
        int []second = sort(right);

        return merge(first,second);

    }

    private static int[] merge(int[] first, int[] second) {

        int i=0;
        int j=0;
        int k=0;
        int[] mix =new int[first.length + second.length];

        while(i< first.length  && j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                k++;
                i++;
            }else{
                mix[k] = second[j];
                k++;
                j++;
            }
        }

        // one array get empty and other still contains ele

        while(i< first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return  mix;
    }

}
