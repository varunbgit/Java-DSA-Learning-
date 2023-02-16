package com.varun;

import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {

        if(s.equals("")){
            return 0;
        }

        int count =1;

        for (int i = 0; i <s.length() ; i++) {
            int c = 1;
            String us = "" +  s.charAt(i);

            for (int j = i+1; j <s.length() ; j++) {
                String js = "" + s.charAt(j);
                if(us.contains(js)){
                    break;
                }else{
                    us += js;
                    c++;
                }
                count = Math.max(count,c);
            }

        }
        
        return count;
    }
}
