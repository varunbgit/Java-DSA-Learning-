package com.varun;

public class Find_XOR_in_Range {
    public static void main(String[] args) {
        int start = 3;
        int end  = 10 ;
        int tillend = XOR(end);
        int tillstart = XOR(start-1);
        int ans = tillend ^ tillstart;
        System.out.println(ans);


    }
    private static int XOR(int n) {
        if(n % 4== 0){
            return n;
        }else if (n % 4 == 1){
            return 1;
        }else if(n % 4 == 2){
            return n+1;
        }else{
            return 0;
        }
    }
}
