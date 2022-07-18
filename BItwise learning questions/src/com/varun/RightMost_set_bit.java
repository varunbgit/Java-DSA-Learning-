package com.varun;

public class RightMost_set_bit {
    public static void main(String[] args) {
        int n = 8;
        int ans = getFirstSetBitPos(n);
        System.out.println(ans);
    }

//     static int find(int n) {
//        int complement = -n ;
//        int ans  = n & complement;
//        return ans;
//    }

    public static int getFirstSetBitPos(int n)
    {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
    }

}
