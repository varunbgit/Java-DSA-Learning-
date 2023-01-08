package com.varun;
//https://leetcode.com/problems/reverse-pairs/


public class ReversePair {
    public static void main(String[] args) {
        int [] nums =  {1,3,2,3,1};
//        int [] nums =  {2,4,3,5,1};
//        int [] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int ans = reversePairs(nums);
        System.out.println(ans);
//        System.out.println(Integer.MAX_VALUE);
    }


    public static int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
//                long no = 2L * nums[j];
                long no = (2L * nums[j]);
                if((long)(nums[i])  > no){
                    count++;
                }
            }
        }
        return count;
    }

    //still this is giving a TLE error for large arr length

    //  **** Optimized Solution *****

    static int count = 0 ;
    
    public static int reversePair2(int [] nums){
        mergeSort(nums,0,nums.length);
        return count;
        
    }

    private static void mergeSort(int[] nums, int s, int e) {
        if(e-s == 1){
            return ;
        }
        int m = (s+e)/2;

        mergeSort(nums,s,m);
        mergeSort(nums,m,e);

        mergeArrays(nums,s,m,e);
    }

    private static void mergeArrays(int[] nums, int s, int m, int e) {

        int i = s;
        int j =m;
        int in = 0;
        int [] mix = new int[e-s];
        while(i< m && j< e){
            if(nums[i]<nums[j]){
                mix[in] = nums[i];
                i++;
            }else if(nums[i]<nums[j]){
                if(nums[i] > 2 *nums[j]){
                    count+=m-i ;
                }
                mix[in] = nums[j];
                j++;
            }
        }

        while (i<m){
            mix[in] = nums[i];
            in++;
            i++;
        }
        while (j<e){
            mix[in] = nums[j];
            in++;
            j++;
        }

        for (int k = 0; k <mix.length ; k++) {
            nums[s+k] = mix[k];
        }
    }


}

