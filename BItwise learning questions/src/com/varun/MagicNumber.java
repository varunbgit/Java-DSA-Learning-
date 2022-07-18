package com.varun;

public class MagicNumber {
    public static void main(String[] args) {
        int num  = 2;
        int ans = FindMagicNum(num);
        System.out.println(ans);
    }

    private static int FindMagicNum(int num) {
        int pow =1;
        int sum = 0;
        while (num>0){
           int digit = num & 1;
           if(digit!=0){
               sum += Math.pow(5,pow);
           }
           pow++;
           num = num>>1;
        }
        return sum;
    }
}
