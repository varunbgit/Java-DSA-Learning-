package com.varun;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(anagramCheck(s1,s2));
    }
    public static boolean anagramCheck(String s1, String s2){


        int [] alph  = new int[256];

        if(s1.length()!=s2.length()){
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            alph[s1.charAt(i)]++;
            alph[s2.charAt(i)]--;
        }
        for (int i = 0; i <alph.length ; i++) {
            if(alph[i] !=0){
                return false;
            }
        }
        return true;
    }
}
