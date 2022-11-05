package com.varun;

import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[]a = {10,15,20,15,30,30,5};
        int[]b = {30,5,30,80};
        System.out.println(intersection(a,b));

    }
    public static int intersection(int[] a,int[]b){
        int res = 0;
        // inserting all the values of a in  a hashSet
        HashSet<Integer> set = new HashSet<>();
        for (int ele:a){
            set.add(ele);
        }
        // Now while traversing thru the arr b check if ele present in set if yes res ++ and delete the ele from set
        //becuse we only want distinct values;

        for (int ele :b){
            if(set.contains(ele)){
                res++;
                set.remove(ele);
            }
        }
        return res;
    }
}
