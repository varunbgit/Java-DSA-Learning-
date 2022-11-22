package com.varun;

public class checkKthbitIsSetOrNot {
    public static void main(String[] args) {
        int n = 5;  // in binary 101
        int k  = 1; // false
        System.out.println(isSet(n,k));
    }

    private static boolean isSet(int n, int k) {
        //int count=0;
        n =n>>k-1;
        int bit = n &1;
        return bit==1;
    }
}
