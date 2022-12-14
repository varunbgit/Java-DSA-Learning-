package com.varun;
//1732. Find the Highest Altitude

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int current=0;
        int max=0;
        for(int nums:gain){
            current+=nums;
            max=Math.max(max,current);
        }
        return max;

    }
}
