package com.varun;

public class GCD_LCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 30;
        int Gcd = GCD(a,b);
        int Lcm = LCM(a,b,Gcd);
        System.out.println("THe HCF or GCD is " + Gcd +" and LCM is "+Lcm);
    }
    static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    static int LCM(int a, int b,int Gcd){
        return a * b / Gcd;
    }
}
