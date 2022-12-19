package com.varun;

import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int []arr = {10,20,10,10,30,40};
        int window = 4;
        countDistinct(arr,window);
    }

    private static void countDistinct(int[] arr, int window) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <window ; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
       // System.out.println(map);
        System.out.println(map.size());


        for (int i = 1; i <=arr.length-window ; i++) {
            int pVal = map.get(arr[i-1]);
            map.put(arr[i-1],pVal-1);


            if(map.containsValue(0)){
                map.remove(arr[i-1]);
            }
//            System.out.println(map);

            if(!map.containsKey(arr[i+window-1])){
                map.put(arr[i+window-1],1);
            }else{
                map.put(arr[i+window-1],map.get(arr[i])+1);
            }
//            System.out.println(map);
            System.out.println(map.size());
        }

    }

}
