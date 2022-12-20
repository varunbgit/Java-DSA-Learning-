package com.varun;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNbyKoccurencens {
    public static void main(String[] args) {
        int[]arr ={30,10,20,20,20,10,40,30,30};
        int k = 4;
        findMoreOccurences(arr,k);
    }

    private static void findMoreOccurences(int[] arr, int k) {
        //one approach is create a hashmap and store the appearance of each element as key and its frequency as value.
        //then travese thru the hashmap and find if frequency is greater than n/k;
        //Time Complexity is o(n)

        //we have a better solution in o(nK) if k is small/big, it will be more space and time efficient

        HashMap<Integer,Integer> map = new HashMap<>();
//phase1
        for(int ele: arr) {
            if (!map.containsKey(ele)) {
                if (map.size() < k - 1) {
                    map.put(ele, 1);
                } else {
                    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                        map.put(e.getKey(), e.getValue() - 1);
                    }
                }
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }
        System.out.println(map);

//phase2
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue()>arr.length/k){
                System.out.println(e.getKey());
            }
        }



    }
}
