package com.varun;

public class reverse {
    public static void main(String[] args) {
        int number=23597;
        //output=79532

        int rev=0;

        for(int i=0;number!=0;number/=10){
            rev=  (rev *10 + number%10);
            i++;
        }
        System.out.println(rev);

    }
}
