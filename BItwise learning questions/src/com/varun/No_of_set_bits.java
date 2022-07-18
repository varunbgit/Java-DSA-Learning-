package com.varun;

public class No_of_set_bits {
    public static void main(String[] args) {
        int num = 9;
        int ans = find(num);
        System.out.println(ans);
    }

    private static int find(int num) {
        /*
        Approach 1: Counter ++ rightshift

        Approach 2 : find right most set bit , and it counter ++ repeat

        Approach 3: n & n-1  count++ repeat till num >0
         */
        int count =0 ;
        while(num > 0){
            num = num & (num-1);  // as soon as num becomes in form of pow of 2 the and operation becomes 0;
            count++;
        }
        return count;
    }

}
