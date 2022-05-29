package com.varun;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] nums= {5,7,7,8,8,10};
        int target= 8;
        int [] ans=searchRange(nums,target);
        System.out.println("["+ ans[0] + " "+ans[1]+" ]" );

    }


    public static int[] searchRange(int[] nums, int target){
            int [] ans = {-1,-1};

            ans[0]=search(nums,target,true);
            ans[1]=search(nums,target,false);
            return ans;
    }

    public static int search(int[] nums, int target, boolean firstpos){
        int ans =-1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end -start)/2;
            if(target<nums[mid]){
                end =mid -1;
            }
            else if(target > nums[mid])
                start=mid+1;
            else {
                ans=mid;
                if(firstpos){
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}