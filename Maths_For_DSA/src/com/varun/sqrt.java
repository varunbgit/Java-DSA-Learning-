package com.varun;

public class sqrt {
    public static void main(String[] args) {
        int n = 40;
//    sqrt == 6.3245
        double ans  = root(n);
        System.out.println(ans);


    }
    static double root(int n){
        // firstly checking if the root of perfect sq no
        //applying binary search

        int start =0;
        int end = n;
        while(start<end){
            int mid = end - (end - start)/2;
            int square  = mid * mid;
            if(square == n){
                return mid;
            }else if (square < n ){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        // if number is not a perfect square number
        //
        double  num = start + 0.1;
        while(true){

            if(num * num > n){
                return num;
            }else{
                num = num + 0.1;
            }
        }

    }
}
