package com.varun;

public class reverseNumber_V2 {
    public static void main(String[] args) {
        int n = 3457;
        int ans = reverse(n);
        System.out.println(ans);
    }
    static int reverse(int n ){
//        if(n%10 == n){
//            return n;
//        }
        int count = (int)(Math.log10(n) + 1);
       return  helper(n,count);

    }

    private static int helper(int n,int digits) {
        if(n%10 == n){
            return n;
        }

         return helper(n/10,digits -1 ) + (int)(n%10 * Math.pow(10,digits -1)) ;

    }
}
