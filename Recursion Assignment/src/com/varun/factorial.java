package com.varun;

public class factorial {
    public static void main(String[] args) {
        int n = 12;
        int ans = facto(n);
        System.out.println(ans);
    }

    private static int facto(int n) {
        if(n<2){
            return n;
        }
        return n * facto(n-1);
    }
}
