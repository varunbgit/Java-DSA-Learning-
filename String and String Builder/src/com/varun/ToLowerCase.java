package com.varun;

//709. To Lower Case

import java.util.Locale;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "VaRuN";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }
//direct solution  using the prebuilt function

//    public static  String toLowerCase(String s) {
//        return s.toLowerCase();
//    }
      public static String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder("");
          for (int i = 0; i < s.length(); i++) {
              if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z'){
                  ans.append((char)(s.charAt(i)-'A'+'a'));
              }else
                  ans.append(s.charAt(i));
          }
          return ans.toString();
      }
}
