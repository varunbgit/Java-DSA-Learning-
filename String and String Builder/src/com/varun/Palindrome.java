package com.varun;

public class Palindrome {
    public static void main(String[] args) {
        String  word   = "wowhoo";
        System.out.println("String is : " +(palindromeCheck(word)));
    }


    public static boolean palindromeCheck(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;

    }
}
