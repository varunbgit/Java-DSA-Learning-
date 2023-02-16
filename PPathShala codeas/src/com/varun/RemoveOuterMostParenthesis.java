package com.varun;

import java.util.Arrays;
import java.util.Stack;

public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())" ;
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int Sindex=0;
        int Eindex = -1;
        String ans  = "";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }

            if(st.isEmpty()) {
                Eindex = i;


                String s1 = s.substring(Sindex+1, Eindex);
//                System.out.println(s1);
//                String s2 = "";
//                StringBuilder sb  = new StringBuilder();
                Sindex = Eindex + 1;

//                for (int j = 1; j < s1.length() ; j++) {
//                    char ch =  s1.charAt(i);
//                    sb.append(ch);
//                }


//                ans += sb.toString();
                ans += s1;
//                System.out.println(ans);
            }
        }

//int [] arr = {1,3,4,5,6};


        return ans ;
    }



}
