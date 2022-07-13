package com.varun;

public class Set_ith_bit {
    public static void main(String[] args) {
        int num = 10;
        int pos = 3;
        set(num,pos);
    }

    private static void set(int num, int pos) {
        //or that bit thats it

        int mask = 1 << pos-1;
        num = num | mask ;

        System.out.println(num);

    }
}
