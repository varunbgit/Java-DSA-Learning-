package com.varun;

public class SumofDigitsRecursion {
    public static void main(String[] args) {
        int num = 12345;
        int ans  = sum(num);
        System.out.println(ans);
    }

    public static int sum (int num ){
//        if(num/10 == 0){
//            return  num%10;
//        }
//
//        return num % 10 + sum(num/10);

        int sum =0 ;
        while(num /10 != 0){
            sum = sum + num %10;
            num = num /10 ;
        }
        sum = sum + num %10;

        return  sum;
    }
}
