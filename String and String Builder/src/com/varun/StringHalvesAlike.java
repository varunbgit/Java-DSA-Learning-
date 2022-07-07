package com.varun;
//1704. Determine if String Halves Are Alike
public class StringHalvesAlike {
    public static void main(String[] args) {
       String s = "textbook";
       System.out.println(halvesAreAlike(s));
    }
    public  static boolean halvesAreAlike(String s) {
        //we are given strings are even in length;
        return checkVowels(s.substring(0,s.length()/2))==checkVowels(s.substring(s.length()/2));

        //s.substring  => if provided two arguments they are begin & end index else if one provided its beginning index.



    }
    static int checkVowels(String s){
        int vowel = 0 ;
        for (int i = 0; i <s.length() ; i++) {
            if(     s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' ||s.charAt(i) == 'E'||s.charAt(i) == 'I' || s.charAt(i) == 'O' ||s.charAt(i) == 'U' ){
                vowel++;
            }
        }
        return vowel;
    }
}
