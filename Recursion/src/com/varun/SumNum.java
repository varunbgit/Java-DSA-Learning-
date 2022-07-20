package com.varun;

public class SumNum {
    public static void main(String[] args) {
        int n= 5;
        int ans = sum(n);
        System.out.println(ans);
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
