package com.varun;

public class SkipString {
    public static void main(String[] args) {
        String str = "baccapplead";
        String toSkip = "apple";

        String ans = skipString(str,toSkip);
        System.out.println(ans );
    }

    private static String skipString(String str, String toSkip) {

        if(str == ""){
            return "";
        }

        if(str.startsWith(toSkip)){
            return skipString(str.substring(toSkip.length()),toSkip);
        }
        return str.charAt(0)  + skipString(str.substring(1),toSkip) ;
    }
}
