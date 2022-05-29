package com.varun;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Celing_Floor_Number {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        //IMP Array must be sorted
        int target ;
        System.out.println("Enter the target variable");
        Scanner in = new Scanner(System.in);
        target = in.nextInt();

        int ceil_no=Check_ceil(arr,target);
        int floor_no=Check_floor(arr,target);
        System.out.println("The Ceil number is "+ceil_no);
        System.out.println("The floor number is "+floor_no);

    //Ceiling Number == The Smallest Number which is just greater or = to the target integer.
    //Floor number == The greatest number smaller than equal to target int.
    }
    public static int Check_floor(int[] arr,int target){
        if(target<  arr[0]){
            return -1;
        }
        int s=0;
        int e;
        e = arr.length -1;
        int mid=0;

        while (s<=e){
            mid= s+(e-s)/2;
            //this approach is useful when array size is too large, (s+e) might xceed the range the int .
            //this is same as (s+e)/2.


            int i= arr[mid];
            if(arr[mid]==target){
                return  arr[mid];
            }
            if(arr[mid]>target){
                e=mid-1;
            }
            if(arr[mid]<target){
                s=mid+1;
            }
        }
        return arr[e];
    }
    public static int Check_ceil(int [] arr, int target){

        if(target > arr[arr.length -1]){
            return -1;
        }

        int s=0;
        int e;
        e = arr.length -1;
        int mid=0;

        while (s<=e){
             mid= s+(e-s)/2;
             //this appraoch is useful when array size is too large, (s+e) might xceed the range the int .
            //this is same as (s+e)/2.


           int i= arr[mid];
            if(arr[mid]==target){
               return  arr[mid];
            }
            if(arr[mid]>target){
                e=mid-1;
            }
            if(arr[mid]<target){
                s=mid+1;
            }
        }
        return arr[s];

    }

}
