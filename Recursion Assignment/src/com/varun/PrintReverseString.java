package com.varun;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintReverseString {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
//
    }

//    public static void reverseString(char[] s) {
//        helper(s,0);
//        System.out.println(list.toString());
//
//    }
//    static ArrayList<Character> list  =  new ArrayList<>();
//    private static void helper(char[] s, int i) {
//
//        if(i == s.length){
//            return;
//        }
//
//        helper(s,i+1);
//        list.add(s[i]);
//
//    }
    public static void reverseString(char[] s) {
        helper(s,0,s.length-1);
        System.out.println(s);
    }

    private static void helper(char[] s, int start, int end) {
        if(start>end){
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(s,start +1,end -1);
    }
}
