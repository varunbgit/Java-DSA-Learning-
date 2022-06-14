package com.varun;

//367. Valid Perfect Square

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {

            return true;
        }

        int start =0;
        int end = num/2;

        while(start<=end){
            long mid = start +(end -start)/2;

            if(mid*mid == num){
                return true;
            }
            if(mid*mid  > num){
                end =(int)(mid - 1);
            }else{
                start = (int)(mid + 1);
            }
        }
        return false;
    }
}
