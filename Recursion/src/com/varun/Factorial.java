package com.varun;

public class Factorial {
    public static void main(String[] args) {
        int n =5;
        int ans = product(n);
        System.out.println(ans);
    }

    private static int product(int n) {
        if(n==1){
            return 1;
        }
        return n * product(n-1);
    }
}
