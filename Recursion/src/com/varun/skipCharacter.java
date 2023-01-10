package com.varun;

public class skipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        char toSkip = 'a';

        String ans = skip(str,toSkip);
        System.out.println(ans );
    }

    private static String skip(String str, char toSkip) {
        String ans = "";
        return skipRec(str,toSkip,ans);
    }

    private static String skipRec(String str, char toSkip, String ans) {

        if(str == ""){
            return ans ;
        }
        StringBuilder s = new StringBuilder(str);
        if(s.charAt(0) != toSkip){
            //add to ans
            ans+= s.charAt(0);

        }
        s.deleteCharAt(0);
        return skipRec(s.toString(),toSkip,ans);

    }
}
