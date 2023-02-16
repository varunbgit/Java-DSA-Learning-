package com.varun;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int []nums = {3,30,34,5,9} ;
        String ans = largestNumber(nums);
        System.out.println(ans);
    }
    public static String largestNumber(int[] nums) {

        String[] temp = new String[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            temp[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
//                String sa = o1;
//                String sb = o2;
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });

        if(temp[0].equals("0")){
            return "0";
        }
        String ans ="";
        for (String s : temp){
            ans += s ;
        }
        return ans;
    }
}
