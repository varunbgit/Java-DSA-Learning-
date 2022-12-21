package com.varun;

import java.util.HashSet;
import java.util.Iterator;

public class LargestSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,3,2,9,10};
        int ans = maxLenght(arr);
        System.out.println(ans);
    }

    private static int maxLenght(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        System.out.println(set);
        int len =0;
        for (int ele:set) {
            int currLen =1;
            if(!set.contains(ele-1)){
                int i=1;
                while(set.contains(ele + i)){
                    currLen++;
                    i++;
                }

                len=Math.max(len,currLen);

            }
        }
        return len;
    }

}
