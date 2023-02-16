package com.varun;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class FirstUniquechar {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        //store indexes of unique value
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }

            int freq = map.get(s.charAt(i));
            if( freq == 1){
                q.add(i);
            }
        }
        System.out.println(map);
        while(!q.isEmpty()){
            int in = q.remove();
            if(map.get(s.charAt(in)) == 1){
                return in;
            }
        }
        return -1;

    }

}
