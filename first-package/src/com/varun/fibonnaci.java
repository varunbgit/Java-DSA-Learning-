package com.varun;
//Find the nth fiboonacci Number


import java.util.Scanner;

public class fibonnaci {

    public static void main(String[] args) {
        System.out.println("Enter a integer ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println("The number you entered is "+n);
        int a=0;
        int b=1;
        int count=2;
        int ans=0;
        while (count<=n){
            ans =a+b;
            a=b;
            b=ans;
            count++;
        }
        System.out.println("the fibo number is "+ ans);


    }
}
