package com.varun;

import java.util.Arrays;

public class ShuffledString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s,indices);
        System.out.println(ans);
    }

//    public static String restoreString(String s, int[] indices) {
//        int num =0;
//        StringBuilder ans = new StringBuilder("");
//        while(num<s.length()){
//            for (int i = 0; i < indices.length ; i++) {
//                if(indices[i] == num){
//                    ans.append(s.charAt(i));
//                    num++;
//                }
//            }
//        }
//        return ans.toString();
//    }


    //Approach 2
    //more optimized

public static String restoreString(String s, int[] indices) {
        char[] ans = new char [indices.length];
   // StringBuilder finalans = new StringBuilder("");
    for (int i = 0; i < indices.length; i++) {
        ans[indices[i]] = s.charAt(i);
    }
    return new String(ans);
}
    }
