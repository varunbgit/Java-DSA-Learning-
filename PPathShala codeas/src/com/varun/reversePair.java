package com.varun;

public class reversePair {
    public static void main(String[] args) {
        long [] nums =  {2, 3, 4, 5, 6};
        long ans  = inversionCount(nums, nums.length);
        System.out.println(ans);
    }

    static long count = 0;
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        mergeSort(arr,0, (int)(N));
        return count;
    }



    private static  void mergeSort(long[] arr, int  s, int e) {
        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeArrays(arr,s,mid,e);
    }

    private static void mergeArrays(long[] arr, int s, int mid,int e) {
        int  i =s;
        int j =mid;
        int in = 0;
        long [] mix = new long[e-s];

        while(i < mid && j< e ){
            if(arr[i] <= arr[j]){
                mix[in] = arr[i];
                i++;
            }
            else if (arr[i] > arr[j]){
                count += mid - (s-i) ;
                mix[in] = arr[j];
                j++;
            }
            in++;
        }

        while (i<mid){
            mix[in] = arr[i];
            i++;
            in++;
        }
        while (j<e){
            mix[in] = arr[j];
            j++;
            in++;
        }

        for (int k = 0; k < mix.length; k++) {
            arr[s+k] = mix[k];
        }
    }


















//    leetcode problem slightly differnt
//    static int count = 0 ;
//    public static int reversePairs(int[] nums) {
//        mergeSort(nums,0,nums.length);
//        return count;
//    }
//    private static void mergeSort(int[] nums, int s, int e) {
//        if(e-s == 1){
//            return;
//        }
//        int m = (s+e)/2;
//
//        mergeSort(nums,s,m);
//        mergeSort(nums,m,e);
//
//        mergeArrays(nums,s,m,e);
//    }
//
//    private static void mergeArrays(int[] nums, int s, int m, int e) {
//
//        int i = s;
//        int j =m;
//        int in = 0;
//        int [] mix = new int[e-s];
//        while(i< m && j< e){
//            if(nums[i]<=nums[j]){
//                mix[in] = nums[i];
//                i++;
//            }else if(nums[i]<nums[j]){
//                if(nums[i] > 2 *nums[j]){
//                    count+=m-i ;
//                }
//                mix[in] = nums[j];
//                j++;
//            }
//            in++;
//        }
//
//        while (i<m){
//            mix[in] = nums[i];
//            in++;
//            i++;
//        }
//        while (j<e){
//            mix[in] = nums[j];
//            in++;
//            j++;
//        }
//
//        for (int k = 0; k <mix.length ; k++) {
//            nums[s+k] = mix[k];
//        }
//    }
}
