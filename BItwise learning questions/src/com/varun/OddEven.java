package com.varun;

public class OddEven {
    public static void main(String[] args) {
        int num = 16;
        boolean isodd = checkIsOdd(num);
        System.out.println("The no is odd : " + isodd);
    }
//last bit of the number is one which add 2^0=1 so it is one no is odd else even

    private static boolean checkIsOdd(int num) {
        int lastbit = num & 1 ;
        if(lastbit ==1){
            return true;
        }else
            return false;
    }
}
