package com.varun;

public class Find_ith_bit_of_number {
    public static void main(String[] args) {
        int num = 10;
        int pos = 2;
        find(num,pos);
    }

    static void find(int num,int pos){
        //create a mask of that where set bit at pos and rest bits = 0
        int mask = 1 << pos-1;
        int ans = num & mask;
        System.out.println(ans>>pos-1); // sout(ans) gives ans in integer form;
    }
}
