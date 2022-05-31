package com.varun;

import java.util.GregorianCalendar;

public class BsearchinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target=2 ;
        int index=0;
        int largestelementindex  = GreatestEleIndex(arr);
        System.out.println("Pivot Element "+ largestelementindex);
        if(largestelementindex!=-1){
             index=BinarySearch(arr,target,0,largestelementindex);
             if(index==-1){
                 index=BinarySearch(arr,target,largestelementindex,arr.length-1 );
             }
        }
        System.out.println("Element found at index: "+index);



    }

   public  static int GreatestEleIndex (int [] arr){
        int start=0;
        int end = arr.length -1;

       while (start <= end) {
           int mid = start + (end - start) / 2;

           if (mid<end && arr[mid]> arr[mid+1] ){
               return mid ;
           } else if ( (mid>start && arr[mid]<arr[mid-1]))
               return mid-1 ;
           else if (arr[mid]<=arr[start])
               end = mid - 1;
           else if(arr[mid]>=arr[start]) {
               start = start+1;
           }
       }
       return -1 ;
   }
   public static int BinarySearch(int [] arr , int target,int start,int end ){

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
       return -1;
   }
}
