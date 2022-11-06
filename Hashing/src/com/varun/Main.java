package com.varun;

import java.util.HashSet;

public class Main {


	// write your code here
        public static char lostChar(String stringSent, String stringRec)
        {
            char answer =stringSent.charAt(stringSent.length()-1) ;
// Write your code here
            HashSet<Character> set  = new HashSet<>();
            for (int i = 0; i < stringRec.length(); i++) {
                set.add(stringRec.charAt(i));
            }
            //checking the string sent

            for (int i = 0; i <stringSent.length() ; i++) {
                if(!set.contains(stringSent.charAt(i))){
                    return stringSent.charAt(i);
                }
            }

            return answer;
        }
    public static void main(String[] args)
    {
 //       Scanner in = new Scanner(System.in);
// input for stringSent
        String stringSent = "abcdfjgerj";
        // input for stringRec
        String stringRec = "abcdfjger";
        char result = lostChar(stringSent, stringRec);
        System.out.print(result);
    }
}


