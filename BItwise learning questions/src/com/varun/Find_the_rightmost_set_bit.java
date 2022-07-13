package com.varun;

public class Find_the_rightmost_set_bit {
    public static void main(String[] args) {
        int num = 10 ;
        check(num);
    }

    private static void check(int num) {
        int ans  = num & (-1 * num);
        System.out.println(ans);
    }
}
