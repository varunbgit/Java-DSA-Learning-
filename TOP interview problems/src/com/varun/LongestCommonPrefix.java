package com.varun;
//lc 14 : https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] str  = {"ab", "a"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }
    public static  String longestCommonPrefix(String[] strs) {

        String ans= "";
        if(strs.length < 2){
            return strs[0];
        }

        for (int i = 0; i <strs[0].length() ; i++) {
            char temp = 0;
            if(i<strs[0].length())
                 temp  = strs[0].charAt(i);

            for(String s : strs){

                if(i>s.length()-1 || s.charAt(i) != temp){
                    return ans;
                }
            }
            ans += temp;
        }
        return ans;
    }
}
