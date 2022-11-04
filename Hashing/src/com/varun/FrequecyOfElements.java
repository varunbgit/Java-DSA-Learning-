package com.varun;

import java.util.HashMap;

public class FrequecyOfElements {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,10};
        System.out.println(freq(arr));
    }

    public static HashMap<Integer,Integer> freq (int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i]) ){
                map.replace(arr[i],map.get(arr[i]),map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
}
