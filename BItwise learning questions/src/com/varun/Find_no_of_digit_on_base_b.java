package com.varun;

public class Find_no_of_digit_on_base_b {
    public static void main(String[] args) {
        int num = 5050;
        int base = 10;

        noDigit(num,base);
    }

    private static void noDigit(int num, int base) {

        int ans  = (int) (Math.log10(num)/Math.log10(base)) ;
        System.out.println(ans +1);
    }
}
