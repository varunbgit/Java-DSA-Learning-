package com.varun;


public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println("The Peak element is at Index " + Peakelement(arr));
    }

    public static int Peakelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid+1]) {
                start = mid +1 ;
            }
            else {
                 end=mid;

            }

        }
        return start ;
        
    }
}

//  1,2,3,4,5,6,7,8,10,15,17,18,19,22,15,14,13,12,10,9,7,5,3,2,1,0