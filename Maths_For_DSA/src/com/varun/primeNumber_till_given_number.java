package com.varun;

public class primeNumber_till_given_number {
    public static void main(String[] args) {
        int n = 40;
        Primes(n);
    }
    static void Primes(int n){
        int c = 2;
        boolean [] arr = new boolean[n-1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = true;
        }

        while(c * c <= n){
            boolean value = isPrime(c);
            arr[c-2] = value;
            if(value){
                for (int i = 2; (c * i )<=n ; i++) {
                    if(arr[c *i -2]!=false){
                        arr[ c*i -2] =false;
                    }
                }
            }
            c++;
        }
        // print all the remaining values
        for (int i =0 ;i<arr.length;i++){
            if(arr[i]){
                System.out.print((i+2) +", ");
            }
        }
    }
    static boolean isPrime(int n){
        int c =2;
        while(c * c <=n){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
