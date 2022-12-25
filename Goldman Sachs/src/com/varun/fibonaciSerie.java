package com.varun;

public class fibonaciSerie {
    public static void main(String[] args) {
        int n = 3;
        long ans = fibo(n);
        System.out.println(ans);
    }

    private static long fibo(int n) {
        if(n<2){
            return n;
        }
        long ans = 1;
        for (int i = 1; i <n ; i++) {
            ans += i;
        }
        return ans ;
    }
}
