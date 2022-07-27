package com.varun;

//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstCapitalLetter {
    public static void main(String[] args) {
        String s= "geeksforgeeKs";
        char ans = finduppercase(s,0);
        System.out.println(ans);
    }
    static char  finduppercase(String s,int i){
        if(i == s.length()){
            return '0';
        }

        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            return s.charAt(i);
        }
        return finduppercase(s,i+1);
    }
}
