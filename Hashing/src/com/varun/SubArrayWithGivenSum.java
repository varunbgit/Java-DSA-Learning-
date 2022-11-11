package com.varun;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
//        int[] arr = {5,8,6,13,3,-1};
//        int sum = 22;
        int[] arr = {2,3,4,10};
        int sum = 9;
        boolean ans  = findSum(arr,sum);
        System.out.println(ans);
    }
    public static boolean findSum(int [] arr,int sum){
        //Naive Approach

        //take every ele as starting ele of subset and add the ele till the addition becomes greater than given sum
//        optimized solution almost same as subarray with zero sum

        HashSet<Integer>set =new HashSet<>();
        int add = 0;
        for(int ele:arr){
            add = add +ele;
            if(add == sum){
                return true;
            }
            if(set.contains(add-sum)){//this code fails for one condition if the starting subArray contains the sum
                return true;
            }
            set.add(add);

        }
        return false;


    }
}
