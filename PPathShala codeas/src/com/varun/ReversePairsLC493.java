package com.varun;

public class ReversePairsLC493 {
    public static void main(String[] args) {
//        int []nums = {1,3,2,3,1};
        int []nums = {2,4,3,5,1};
        int ans = reversePairs(nums);
        System.out.println(ans);
    }

    static int count = 0 ;
    public static int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length);
        return count;
    }
    private  static void mergeSort(int[] nums, int s, int e) {
        if(e-s == 1){
            return;
        }
        int m = (s+e)/2;

        mergeSort(nums,s,m);
        mergeSort(nums,m,e);

        mergeArrays(nums,s,m,e);
    }

    private  static void mergeArrays(int[] nums, int s, int m, int e) {

        int i = s;
        int j =m;
        int in = 0;
        int [] mix = new int[e-s];
        while(i< m && j< e){
            if(nums[i]<=nums[j]){
                mix[in] = nums[i];
                i++;
            }
            else if(nums[i] > nums[j]){
//                count+=m - (s+i);
                if(nums[i] > 2 * nums[j]){
                    count +=  m - (s+i) ;
                }
                mix[in] = nums[j];
                j++;

            }

            in++;
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
