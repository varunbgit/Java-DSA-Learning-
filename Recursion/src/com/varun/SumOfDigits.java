package com.varun;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1345 ;
        int ans = sum(n);
        System.out.println(ans);
    }

    private static int sum(int n) {
        if(n%10 == n){
            return n;
        }
        return n%10 + sum(n/10);
    }


}
