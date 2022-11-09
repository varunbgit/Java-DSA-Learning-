package com.varun;

import java.util.HashMap;
import java.util.HashSet;

public class PairWithGivenSumInUnSortedArray {
    public static void main(String[] args) {
//        int []arr = {3,2,8,15,-8};
//        int sum  = 17;
        int []arr = {11,5,6};
        int sum  = 10;
        System.out.println(sumExists(arr,sum));
    }
    public static boolean sumExists(int [] arr,int sum){
//        HashSet set = new HashSet(arr.length);

//        for (int ele:arr){
//            set.add(ele);
//        }
//        for (int ele:arr){
//            int secondNum = sum-ele;
//            if(set.contains(secondNum)){
//                return true;
//            }
        //this is an incorrect solution try the case where arr=[11,5,6] and sum =10;
        //it will give ans as True while ans must be false;
        // also it takes O(n) two time one for insertion in a set and other for traversing.

        // The Correct approach
        HashSet set = new HashSet(arr.length);
        for (int ele:arr){
            int secondNum = sum-ele;
            if(set.contains(secondNum)){
                return true;
            }
            set.add(ele);
        }


        return false;
    }
}
