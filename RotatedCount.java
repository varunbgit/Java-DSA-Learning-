package com.varun;

public class RotatedCount {
    public static void main(String[] args) {
        //find the pivot(Greatest element
        //and Ans is index of Pivot elemement +1

        int arr[] = {4,6,7,0,1,2,3};
        int ans = CheckPivot(arr)  + 1 ;
        System.out.println("Array is Rotated by index "+ans);

    }

    private static int CheckPivot(int[] arr) {
        int start=0;
        int end =arr.length-1;
        while(start<=end ){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                end = mid -1;
            }
            else{
                start=mid+1;
            }

        }

        return -1;
    }
}


