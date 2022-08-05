package com.varun;

public class primeCheck {
    public static void main(String[] args) {
        int n = 6;
        boolean ans = check(n,2);
        System.out.println(ans);
    }

    public static boolean check(int n,int i){
        if(i * i >n){
            return true;
        }

        if(n%i == 0){
            return false;
        }else{
            return  check(n, i + 1);
        }


    }
}
