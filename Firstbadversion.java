//package com.varun;
//// 278. First Bad Version
//
///*You are given an API bool isBadVersion(version) which returns whether version is bad.
//Implement a function to find the first bad version.
//        You should minimize the number of calls to the API.
//*/
//public class Firstbadversion {
//    public static void main(String[] args) {
//        int n=5;
//        int isbad = firstBadVersion(n);
//
//
//    }
//    public static int firstBadVersion(int n) {
//       // int ans=0;
//        int start =0 ;
//        int end = n;
//
//        while (start < end){            //if approach1 start<=end
//            int mid = start + (end-start)/2;
////            Approach 1
////            if(isBadVersion(mid)){
////                if(isBadVersion(mid-1)){
////                    end = mid-1;
////                }else{
////                    return mid;
////                }
////            }else{
////                start = mid+1;
////            }
//            if(isBadVersion(mid)){
//                end =mid;
//            }
//            else{
//                start = mid+1;
//            }
//
//        }
//       // return  -1;
//        //if apporach 1
//        return end;
//    }
//}
