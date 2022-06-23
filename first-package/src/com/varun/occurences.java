package com.varun;

import java.util.Scanner;

public class occurences {

    public static void main(String[] args) {
        int number= 1385757879;
        System.out.println("Enter the number whose occurrence is to be found ");

        Scanner in=new Scanner (System.in);

        int n=in.nextInt(); //7
        int ans=0;
        while(number!=0){
            int temp=number%10;
            if(temp==n){
                ans++;
            }
            number=number/10;
        }
        System.out.println(ans);

    }
}
