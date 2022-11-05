package com.varun;

import java.util.HashMap;

public class MaxFrequnecyOfString {
    public static void main(String[] args) {
        String str = "jog for Geeks jog";
        System.out.println(findMax(str));

    }
    public static String findMax(String str){
        HashMap<String,Integer> map = new HashMap<>();
        int max =0;
        str = str+" ";
        String word = "";
        String ans ="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch!=' '){
                word = word+ch;
            }else{
                //put the word in map or incerment its value
                if(map.containsKey(word)){
                   if(max<map.get(word)+1){
                       max = map.get(word)+1;
                       ans = word;

                   }
                   map.put(word,map.get(word)+1);


                }else{
                    map.put(word,1);
                }
                word = "";
            }
        }
            return ans;
    }
}
