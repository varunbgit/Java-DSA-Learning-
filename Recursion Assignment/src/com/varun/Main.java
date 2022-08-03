package com.varun;

import java.util.Arrays;

public class Main {
    public static int findIndex(){
        int arr[] ={5,7,8,9,10,16,18};
        int target = 10;
        int len=arr.length;
        int start=0;
        int end=len-1;

        System.out.println("reached here ");
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
int ans = findIndex();
        System.out.println(ans);
    }
}
