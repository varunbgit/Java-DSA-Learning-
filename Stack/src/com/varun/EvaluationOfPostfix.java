package com.varun;

import java.util.ArrayDeque;

public class EvaluationOfPostfix {
    public static void main(String[] args) {
     String str  =  "12345+-*+";
        System.out.println(evaluatePostFix(str));
    }

    public static int evaluatePostFix(String S)
    {
        // Your code here
        ArrayDeque<Integer> stack  = new ArrayDeque<>();
        int op1=Integer.MIN_VALUE;
        int op2 =0;
        for (int i = 0; i < S.length(); i++) {

            if(S.charAt(i)>='0' && S.charAt(i)<='9'){
                //this is a number
                stack.push(S.charAt(i)-'0');
            }else{//    its is an operator
                //identify the operator
                    op2 = stack.pop();;
                    op1 = stack.pop();
//                    op1 = op2 + op1;

                int ans =0;

                if(S.charAt(i)=='+'){
                    ans = op1 + op2;
                }else if(S.charAt(i)=='-'){
                    ans= op1 - op2;
                }else if(S.charAt(i)=='*'){
                    ans = op1 * op2;
                }else{
                    ans = op1 / op2;
                }
                stack.push(ans);
            }

        }
        return stack.pop();
    }
}
