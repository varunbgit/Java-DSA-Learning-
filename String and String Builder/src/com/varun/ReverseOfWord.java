package com.varun;

//2000. Reverse Prefix of Word

public class ReverseOfWord {
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index =0;
        StringBuilder ans = new StringBuilder();
        while(index<word.length()){
            if(word.charAt(index) == ch){
                for (int i =index; i >=0 ; i--) {
                    ans.append(word.charAt(i));
                }
                break;
            }else{
                index++;
            }
        }
        if(index==word.length()){
            return word;
        }
        for (int i =index+1; i <word.length();i++) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}
