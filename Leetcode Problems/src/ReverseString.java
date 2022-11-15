//https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String str = "  hello world  ";
        String ans = reverseWords(str);
        System.out.println( ans);
    }
    public static  String reverseWords(String s) {
        s = s +" ";
        String output = "";
        String temp ="";
//        boolean firstInsertion = false;

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch==' '){
               // System.out.println("."+output+".");
                if(!output.equals("") && !temp.equals("") && !temp.equals(" ")){
                    temp += " ";
                }
//                firstInsertion = true;
                temp +=output;

                output = temp;
                temp = "";
            }else{
                temp+=ch;
            }
        }
        return output;
    }
}
