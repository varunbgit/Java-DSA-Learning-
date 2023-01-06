package com.varun;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        int  []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int []nums2 = {2,5,6};
        int n = 3;

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] temp = new int[nums1.length];

        int i ,j,index;
        i = j = index =0;

        while( i < m && j < n ){
            if(nums1[i] <= nums2[j]){
                temp[index] = nums1[i];
                i++;
            }
            else{
                temp[index] = nums2[j];
                j++;
            }
            index++;
        }

        //first array is complete and second left
        if(i == m && j< n){
            while(j<n) {
                temp[index] = nums2[j];
                j++;
                index++;
            }
        }
        //2nd array is completed and first is left
        else if (i < m && j == n) {
            while (i < m) {
                temp[index] = nums1[i];
                i++;
                index++;
            }
        }
//        System.out.println(Arrays.toString(temp));
        for (int k = 0; k <m+n ; k++) {
            nums1[k] = temp[k];
        }

    }
}
