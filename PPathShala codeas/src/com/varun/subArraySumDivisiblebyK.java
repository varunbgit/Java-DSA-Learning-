package com.varun;

public class subArraySumDivisiblebyK {
    public static void main(String[] args) {
        int [] arr = {-5,-5};
        int k =5;
        System.out.println(subarraysDivByK(arr,k));
    }
    public static int subarraysDivByK(int[] A, int K) {
        int[] map = new int[K];
        map[0] = 1;
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;  // Because -1 % 5 = -1, but we need the positive mod 4
            count += map[sum];
            map[sum]++;
        }
        return count;
    }
}
