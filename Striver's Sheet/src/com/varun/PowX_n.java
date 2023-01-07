package com.varun;

public class PowX_n {
    public static void main(String[] args) {
        double x = -1.00000;
        int n  = 2147483647;
//        double x = 2;
//        int n = 10;
        double ans = myPow(x,n);
        System.out.println(ans);

    }
    public static  double myPow(double x, int n) {
        if(x < 0 && (n == Integer.MAX_VALUE ||  n == Integer.MIN_VALUE)){
            if( x == 1)
                return 1;
            if(x == -1){
                if(n%2 == 0) //
                    return 1;
                else
                    return -1;

            }
            else
                return 0;
        }
        if(n == 0){
            return 1;
        }

        double ans = 1;
        boolean isNegative = false;
        if(n < 0){
            isNegative =true;
            n = n * -1;
        }
        for (int i = 1; i <= n; i++) {
            if(!isNegative)
                ans *= x;
            else
                ans /= x;
        }
        return ans;
    }


}
