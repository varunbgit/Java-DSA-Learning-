package com.varun;

import java.util.Arrays;

//https://www.codingninjas.com/codestudio/problems/count-inversions_615?leftPanelTab=0
public class InversionOfArray {
    public static void main(String[] args) {
        long []arr = {2, 5, 1, 3, 4};
//        long []arr = {3,2,1};
//        long []arr = {5,4,3,2,1};
        int n = arr.length;

        long ans = getInversions2(arr,n);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    //optimized solution
    //bruteforce Complexity o(n^2)
    // use mergesort for otimization leading to o(nlogn) complexity
    static long count = 0;
    public static long getInversions2(long arr[], int n) {

         mergeSort(arr,0, n);
        return count;
    }

    private static  void mergeSort(long[] arr, int s, int e) {
        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeArrays(arr,s,mid,e);
    }

    private static void mergeArrays(long[] arr, int s, int mid, int e) {
        int i =s;
        int j =mid ;
        int in = 0 ;
        long [] mix = new long[e-s];

        while(i < mid && j< e ){
            if(arr[i] < arr[j]){
                mix[in] = arr[i];
                i++;
            }
            else if (arr[i] > arr[j]){
                count += mid-i;
                mix[in] = arr[j];
                j++;
            }
            in++;
        }

        while (i<mid){
            mix[in] = arr[i];
            i++;
            in++;
        }
        while (j<e){
            mix[in] = arr[j];
            j++;
            in++;
        }

        for (int k = 0; k < mix.length; k++) {
            arr[s+k] = mix[k];
        }
    }


    //bruteForceApproach
    public static long getInversions(long arr[], int n) {
        int count = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i] > arr[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
