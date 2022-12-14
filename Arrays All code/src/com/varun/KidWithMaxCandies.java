package com.varun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra=3;
        List <Boolean>ansArr=MaxCandies(candies,extra);
        System.out.println(ansArr.toString());

    }

    public static List<Boolean> MaxCandies(int[] candies,int extraCandies){
        int  max=0;
    //    boolean[] output= new boolean[candies.length];
        List<Boolean> list = new ArrayList<Boolean>();
        //List <Boolean>output =new ArrayList<>();
        for(int nums:candies){
            max=Math.max(max,nums);
        }
//        int i=0;
//        while(i < candies.length){
//            if((candies[i] + extraCandies) >= max){
//                output.add(true);
//            }else{
//                output.add(false);
//            }
//
//        }

        for(int i=0;i<candies.length;i++){
            if((candies[i] + extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }

//        for(boolean nums:output) {
//            list.add(nums);
//        }
        return list;
    }
}
