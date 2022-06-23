package com.varun;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        int count=digitcount(num);
        System.out.println("Number of digits: "+count);
        System.out.println("No is Armstrong : "+ check(num,count));


    }
    static int digitcount(int number){
    int count=0;
    while (number!=0){
        number=number/10;
        count ++;
    }
    return count ;

    }


    static boolean check (int n,int count){
        int sum=0;
        int original=n ;
        while(n!=0){
        sum= sum + (int)(Math.pow(n%10,count));
            n=n/10;
        }
        if(sum==original)
            return true;
        else
            return false;
    }
}
