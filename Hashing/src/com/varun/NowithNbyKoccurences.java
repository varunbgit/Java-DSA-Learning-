package com.varun;

import java.util.HashMap;
import java.util.Map;

public class NowithNbyKoccurences {
    public static void main(String[] args) {
        int[]arr = {30,10,20,20,10,20,30,30};
        int k = 4;
        occurencesNbyK(arr,k);
    }

    private static void occurencesNbyK(int[] arr, int k) {
        int NbyK =arr.length/k;
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();

        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }


        for (Map.Entry<Integer,Integer> en:map.entrySet()) {
            if(en.getValue()>NbyK){
                System.out.println(en.getKey());
            }
        }

    }
}
