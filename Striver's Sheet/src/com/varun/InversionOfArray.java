package com.varun;
//https://www.codingninjas.com/codestudio/problems/count-inversions_615?leftPanelTab=0
public class InversionOfArray {
    public static void main(String[] args) {
//        long []arr = {2, 5, 1, 3, 4};
        long []arr = {3,2,1};
        int n = arr.length;
        long ans = getInversions(arr,n);
        System.out.println(ans);
    }

    //bruteForceApproach
    public static long getInversions(long arr[], int n) {
        int count = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i] > arr[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
