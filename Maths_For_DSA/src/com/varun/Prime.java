package com.varun;

public class Prime {
    public static void main(String[] args) {
        int n =40;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        int c =2;
        while(c * c <40){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
