package com.varun;

//leetcode : https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }
    public  static  boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == ')' || ch == ']'|| ch == '}'){
                if(stack.isEmpty()){
                   return false;
                }
                  char top = stack.peek();
                if((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}') ){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(ch);
            }


        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
