package com.varun.practice;

import java.util.Arrays;

public class mergeSortcode {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        mergeSort(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int [] arr , int s,int e){
        if(e-s == 1 ){      // here start is inclusive
            // and end is exclusive
            return ;
        }
        int mid =(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeArrays(arr,s,mid,e);

    }

    public static void mergeArrays(int []arr ,int s,int m ,int e ){
        int[]mix = new int [e-s];

        int i=s;
        int j=m;
        int index =0;

        while(i < m && j< e){
            if(arr[i] > arr[j]){
                mix[index] = arr[j];
                j++;
            }
            else if(arr[i] <= arr[j]){
                mix[index] = arr[j];
                i++;
            }
            index++;
        }

        while(i<m ){
            mix[index] = arr[i];
            i++;
            index++;
        }
        while(j<e ){
            mix[index] = arr[j];
            j++;
            index++;
        }

        for(int k =0 ;k<mix.length ;k++){
            arr[s+k] = mix [k];
        }

    }

}
