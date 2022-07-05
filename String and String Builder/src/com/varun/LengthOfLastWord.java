package com.varun;
//58. Length of Last Word
public class LengthOfLastWord {
    public static void main(String[] args) {

        //  String s = "   fly me   to   the moon  ";
        String s = "s";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }


//"   fly me   to   the moon  "
    public static int lengthOfLastWord(String s) {
        int count =0;

        for (int i = s.length()-1; i>=0;i--){
            char c = (char)(s.charAt(i));
            if(c!=' '){
               count++;
            }else{
                if(count>=1){  // earlier this if loop was not present then if sentence had many spaces at end ans was
                                //coming 0, but it must not count that it should neglect them and check for the word before these spaces.
                    break;
                }

            }
        }
        return count;
    }
}
