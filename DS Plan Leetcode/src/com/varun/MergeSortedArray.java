package com.varun;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2= {2,5,6};
        int n = nums2.length;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0 ;
        int j =0 ;
        int[] ans = new int[m+n];
        int k =0;
        while(i<m && j<n){
            if(nums1[i]<= nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i>=m){
            //nums1 complete
            for (int l = j; l <n ; l++) {
                ans[k] = nums2[l];
                k++;
            }
        }else{
            //nums2 complete
            for (int l =i ; l <m ; l++) {
                ans[k] = nums1[l];
                k++;
            }
        }

        System.arraycopy(ans, 0, nums1, 0, ans.length);

    }
}
