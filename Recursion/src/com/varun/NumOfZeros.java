package com.varun;

public class NumOfZeros {
    public static void main(String[] args) {
        int num = 30202;
        int ans = count(num);
        System.out.println(ans);
    }
    static int count (int num){
        return helper(num,0);

    }
    static int helper(int num,int count){
        if(num %10 == num ){
            return count;
        }
        if(num % 10 == 0){
            return helper(num/10,count +1);
        }
        return helper(num/10,count);
    }
}
