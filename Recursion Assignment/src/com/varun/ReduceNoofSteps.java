package com.varun;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class ReduceNoofSteps {
    public static void main(String[] args) {
        int n = 8;
        int ans = count(n);
        System.out.println(ans);
    }

    private static int count(int n) {
        if(n == 0){
            return 0;
        }
        if(n %2 == 0){
            return 1 + count(n/2);
        }
        else{
            return 1 + count(n -1);
        }
    }
}
