package com.varun;

public class FindXOR_till_n {
    public static void main(String[] args) {
        int n = 9;
        int ans  = XOR(n);
        System.out.println(ans);
    }

    private static int XOR(int n) {
        if(n % 4== 0){
            return n;
        }else if (n % 4 == 1){
            return 1;
        }else if(n % 4 == 2){
            return n+1;
        }else{
            return 0;
        }
    }
}
