package com.varun;

public class skipStringbutWithComdition {
    public static void main(String[] args) {
        String str = "appbacapplecad";
        String toSkip = "app"; // the condition is only that it must not be apple

        String ans = skipAppNotApple(str,toSkip);
        System.out.println(ans );
    }

    private static String skipAppNotApple(String str, String toSkip) {
        if(str == ""){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(toSkip.length()),toSkip);
        }
        return str.charAt(0) + skipAppNotApple(str.substring(1),toSkip);
    }
}
