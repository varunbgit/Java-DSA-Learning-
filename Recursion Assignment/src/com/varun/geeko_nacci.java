package com.varun;
//https://practice.geeksforgeeks.org/problems/geek-onacci-number/0

import java.util.*;
import java.lang.*;
import java.io.*;

public class geeko_nacci {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);

        //for (int i = 0; i < t; i++) {
            int a  = 1;
            int b = 3;
            int c = 2;
            int n = 5;
            int ans = geek (a,b,c,n);
        System.out.println(ans);



    }

    public static int geek (int a,int b,int c,int n){
        if(n == 1){
            return a;
        }
        if(n == 2){
            return b;
        }
        if(n == 3){
            return c;
        }

        return geek(a,b,c,n-1) +geek(a,b,c,n-2)+geek(a,b,c,n-3);
    }

}
