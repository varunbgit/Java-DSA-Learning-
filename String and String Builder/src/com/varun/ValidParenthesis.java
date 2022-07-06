package com.varun;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s= "{[]}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
    public static boolean isValid(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == '('){
                if(s.charAt(i+1) !=')'){
                    return false;
                }
            }
            if(s.charAt(i) == '{'){
                if(s.charAt(i+1) !='}'){
                    return false;
                }
            }
            if(s.charAt(i) == '['){
                if(s.charAt(i+1) !=']'){
                    return false;
                }
            }
        }
        return true;
    }
}
