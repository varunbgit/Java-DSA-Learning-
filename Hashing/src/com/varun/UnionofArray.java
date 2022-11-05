package com.varun;

import java.util.HashSet;

public class UnionofArray {
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[]b = {15,15,15,20,10};
        System.out.println(union(a,b));

    }
    public static int union (int []a,int []b){
        HashSet<Integer> set = new HashSet<>();
        for(int ele :a){
            set.add(ele);
        }
        for(int ele:b) {
            set.add(ele);
        }
        return set.size();
    }
}
