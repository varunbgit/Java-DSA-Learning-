package com.varun;

import static com.varun.PeakMountainArray.Peakelement;

public class FindElementInPeakArray {
    public static void main(String[] args) {


        //firstly find the Peak index in the Array
        //then keeping it as the end point
        //because that gives us the ideal Sorted Array for BinarySearch
        //do a Binary Search to find the Particular Element in the left part (As we need the minimum index in the array)
       int[] arr = {1,2,4,5,3,1};
       int target= 3;
        System.out.println("Element present at index "+IndexSearch(arr,target));
    }

    //One important Point you might have missed
    //What if the element is not present in Ascending Part of Array but is Present in Desending part of array

    public static int IndexSearch(int [] arr, int target) {
        int start = 0;
        int end = Peakelement(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        //B Search in Descending Array
        start = end;
        end =arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {

                end = mid - 1;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }




    //THIS CODE IS EXACTLY COPY PASTED FROM PEAKMOUNTAINARRAY
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



