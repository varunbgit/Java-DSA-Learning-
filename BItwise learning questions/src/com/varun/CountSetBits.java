package com.varun;

public class CountSetBits {
    public static void main(String[] args) {
        int num = 10;
        int ans = countSetBits(num);
        System.out.println(ans);
    }

    private static int countSetBits(int num) {
        int count = 0;
        while(num>0){
            if((num &1) ==1){
                count++;
            }
            num= num>>1;
        }
        return count;
    }
}
