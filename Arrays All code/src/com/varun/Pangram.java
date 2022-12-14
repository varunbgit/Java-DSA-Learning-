package com.varun;
//1832. Check if the Sentence Is Pangram

import  java.util.*;

public class Pangram {
    public static void main(String[] args) {
    String arr= "thequickbrownfoxjumpsoverthelazydog";
    boolean ans = checkIfPangram(arr);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence) {
       // boolean ans=false;
        int [] alphbets = new int [26];
        System.out.println(Arrays.toString(alphbets));
//        for(int nums:alphbets){
//            nums=0;
//        }


        for(int i=0;i<sentence.length();i++){

            alphbets[sentence.charAt(i)-'a']=1;
        }

        for(int num:alphbets){
            if(num==0){
                return false;

            }
        }


        return true;
    }


}
