//package com.varun;
//https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1?page=1&category[]=Sorting&curated[]=1&sortBy=submissions
//public class leastSum {
//    class Solution {
//
//        public long minValue(long a[], long b[], long n)
//        {
//            // Your code goes here
//            Arrays.sort(a);
//            Arrays.sort(b);
//            // Collections.reverse(Arrays.asList(b));
//            // for(int i =0;i<n/2;i++){
//            //     long temp
//            // }
//
//            // for(long ele:b){
//            //     System.out.println(ele);
//            // }
//            long ans = 0;
//            for(long i=0;i<n;i++){
//                ans = ans +a[(int)(i)]*b[(int) (n-1-i)];
//            }
//            return ans;
//        }
//    }
//}
