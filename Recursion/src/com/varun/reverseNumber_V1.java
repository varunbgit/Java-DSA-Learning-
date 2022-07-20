package com.varun;

public class reverseNumber_V1 {
    public static void main(String[] args) {
        int n = 1245;
        int ans = reverse(n);
        System.out.println(ans);
    }
    static int ans =0 ;
    private static int reverse(int n) {
        if(n % 10 == n){
            return n;
        }
        ans = ans * 10 + n%10;
        reverse(n/10);
        return ans;
    }
}
