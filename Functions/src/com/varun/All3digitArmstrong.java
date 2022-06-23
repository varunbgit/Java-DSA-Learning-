package com.varun;

public class All3digitArmstrong {
    public static void main(String[] args) {
     for(int i =100;i<1000;i++){
         if(check(i)){
             System.out.println(i + " ");
         }
     }
    }

    static boolean check (int n){
        int sum=0;
        int original=n ;
        while(n!=0){
            sum= sum + (int)(Math.pow(n%10,3));
            n=n/10;
        }
        if(sum==original)
            return true;
        else
            return false;
    }

}


