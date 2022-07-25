package com.varun;

import javax.print.attribute.standard.PresentationDirection;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        int key =7;
        int index = rSearch(arr,key,0,arr.length-1);
        System.out.println(index);
    }

    private static int rSearch(int[] arr, int key, int s, int e) {

     if(s>e){
         return -1;
     }
       int  mid = (s+e)/2;

       if(arr[mid] == key){
           return mid;
       }
       if(arr[s]<=arr[mid]){
           // Range is sorted
           //lets check if key is also in this mid;
           if(arr[s]<=key && arr[mid]>=key){
               return rSearch(arr,key,s,mid-1);
           }else{
               return rSearch(arr,key,mid+1,e);
           }
       }
       if(key>arr[mid] && key<arr[e]){
            return rSearch(arr,key,mid+1,e);
       }
       else{
           return rSearch(arr,key,mid-1,e);
       }
    }


}
