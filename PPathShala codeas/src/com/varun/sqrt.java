package com.varun;

public class sqrt {
    public static void main(String[] args) {
        int x =2147395599 ;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        int s = 1;
        int e = x;
        int ans = 0;

        while(s<=e){
            int m = s + (e-s)/2;
            // int m = (s+e)/2;
            if(m == x/m){
                return m;
            }
            if(m > x/m){
                e = m - 1;
            }
            else{
                s = m + 1;
                ans = m;
            }
        }
        return ans;

    }
}
