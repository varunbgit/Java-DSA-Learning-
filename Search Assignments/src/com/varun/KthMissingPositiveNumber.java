package com.varun;
//1539. Kth Missing Positive Number
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));

    }
    public static int findKthPositive(int[] arr, int k) {
        int count =0;
        int[] missingEle  = new int[k];

        if(k<arr[0]){  //k is less than first element
            return k;
        }else {
            for (int i=1;count<k;i++ ) {
               if(!BinarySearch(arr, i)){
                   missingEle[count++]=i;
               }
            }
        }
        return missingEle[missingEle.length-1];
    }
    public static boolean BinarySearch(int [] arr , int key){
        int start =0 ;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return true;
            }else if (arr[mid]>key){
                end  = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }

}
