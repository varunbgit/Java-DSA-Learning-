package com.varun;
//https://leetcode.com/problems/power-of-two/

public class PowOf2 {
    public static void main(String[] args) {
        int n = 0;
        boolean ans  = isPowerOfTwo(n);
        System.out.println(ans);
    }
    public static  boolean isPowerOfTwo(int n) {
        if(n>0) {
            if (n >> 1 == 0) {
                return true;
            }

            if ((n & 1) == 1) {
                return false;
            }
            return isPowerOfTwo(n >> 1);
        }
        return false;
    }
}
//decimal to binary representation
//2 = 10
//4 = 100
//8 = 1000