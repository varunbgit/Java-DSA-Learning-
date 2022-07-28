package com.varun;

public class Print_numbers_till_n {
    public static void main(String[] args) {
        int n = 10 ;
        printNos(n);
    }
    static void printNos(int N){
        if(N < 1){
            return;
        }

        printNos(N-1);
        System.out.print(N + " ");
    }

}
