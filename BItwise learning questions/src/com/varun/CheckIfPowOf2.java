package com.varun;

public class CheckIfPowOf2 {
    public static void main(String[] args) {
        int num = 30;
        boolean ans = checkPow(num);
        System.out.println(ans);
    }

    private static  boolean checkPow(int num) {
//        optimized sol
        //Number of Pow of 2 if of format 100000...
        //
        int ans  = num & (num -1);
        if(ans == 0){
            return true;
        }
        return false;
    }


}
