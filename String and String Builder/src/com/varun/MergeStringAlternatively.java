package com.varun;

//1768. Merge Strings Alternately

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String ans = mergeAlternately(word1,word2);
        System.out.println(ans);
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int index =0 ;

        int i ;
        for ( i = 0; i <word1.length() && i<word2.length() ; i++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            ans.append(word1.substring(i)); // if only one argument is passed then it takes string from index passes to last
        }
        if(word1.length()<word2.length()){
            ans.append(word2.substring(i));// if only one argument is passed then it takes string from index passes to last
        }
        return ans.toString();

    }
}
