package com.varun;

import java.util.Scanner;

public class Primecheck {

    public static void main(String[] args) {
        System.out.println("Enter a number to  check");

        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("the number is prime :"+checkp(num));
    }
    //Approch 1
//    static boolean check(int n){
//     for (int i=2;i<n;i++){
//         if(n%i==0){
//             return false;
//         }
//
//     }
//     return true;
//    }
    static boolean checkp(int n){
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
