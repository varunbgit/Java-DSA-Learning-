package com.varun;
//https://codeforces.com/contest/797/problem/C

import java.util.ArrayList;
import java.util.Stack;

public class MinimalString {
    public static void main(String[] args) {
//        String s  = "abxefcdmnacyp";
        String s = "acdb";
        String ans = minimalString(s);
        System.out.println(ans);
    }

    private static String minimalString(String s) {
        Stack<Character> st = new Stack<>();
        String u = "";
        ArrayList<Integer> fq = new ArrayList<>(26);
        for (int i = 0; i <26 ; i++) {
            fq.add(i,0);
        }
        for (int i = 0; i < s.length(); i++) {
            fq.add(s.charAt(i)-'a',fq.get(s.charAt(i)-'a') + 1);
        }

        for (int i = 0; i <s.length() ; i++) {
            st.push(s.charAt(i));
            char ch = st.peek();
            int f = fq.get(ch-'a')-1;
            fq.set(s.charAt(i)-'a',f);

            while(!st.isEmpty()){
//                boolean flag  = smallerPresent(st.peek(),fq);
                boolean flag = false;
                for (int j = 0; j <ch-'a' ; j++) {
                    if (flag) {
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    u+=st.pop();
                }else{
                    break;
                }

            }
        }

        while(!st.isEmpty()){
            u+= st.pop();
        }


        return u;
    }

//    private static boolean smallerPresent(Character p, ArrayList<Integer> fq) {
//        for (int i = 0; i <p-'a' ; i++) {
//            if(fq.get(i) > 0){
//                return true;
//            }
//        }
//        return false;
//    }
}
