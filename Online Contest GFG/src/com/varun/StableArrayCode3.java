//package com.varun;
//
//public class StableArrayCode3 {
//    public static void main(String[] args) {
//        int a[] = {1,1,2,4,1,2,2};
//        int ans = stableArray(a.length,a);
//        System.out.println(ans);
//    }
//    public static int stableArray(int n, int[] a) {
//        // code here
//        //finding max value first;
//        int max = Integer.MIN_VALUE;
//        for(int ele : a){
//            if(ele>max){
//                max= ele;
//            }
//        }
//
//        //int [] temp = new int[max];
//        int[] temp2 = {0};
//
//        for(int ele : a){
//          temp2 [ele -1 ]++;
//        }
//
//
//
//    }
//}
