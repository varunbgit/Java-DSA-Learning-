package com.varun;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int []arr = {1,3,5,6};
        int ans = searchInsert(arr,0);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1 ;
        int mid = -1 ;
        while(s<=e){
            mid = (s+e)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                e = mid -1;
            }else{
                s = mid + 1;
            }

        }
        return s;
    }
}
