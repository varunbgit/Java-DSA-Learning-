package com.varun;
import java.util.*;

//3 numbers given print the largest

public class Largest {
    public static void main(String[] args) {
       int a,b,c;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter first integer");
        a=input.nextInt();
        System.out.println("Enter second integer");
        b=input.nextInt();
        System.out.println("Enter third integer");
        c=input.nextInt();

        //Approach 1
        int max = a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Largest of all is "+ max);

        //Approach 2

        int max2=Math.max(c,Math.max(a,b));
        System.out.println(max2);
//        //Approach 3

//        if(a>b && a>c){
//            System.out.println("First Number is largest "+a);
//        }else if(b>a && b>c){
//            System.out.println("Second Number is largest "+b);
//        }
//        else{
//            System.out.println("Third Number is largest "+c);
//        }



    }
}
