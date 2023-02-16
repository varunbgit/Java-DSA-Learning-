package com.varun;

public class FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {
        int [] nums = {1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length -1;

        //array is completely sorted
        if(nums[0] < nums[nums.length-1]){
            return nums[0];
        }

        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
//            if(nums[0] < nums[nums.length-1]){
//                ans = nums[0];
//                break;
//            }
//            else if( nums[0] > nums[nums.length-1]){
//                ans = nums[nums.length-1];
//                break;
//            }
            if(mid != 0 && nums[mid] < nums[mid-1]){
                return nums[mid ];
            }

            if(nums[mid] >= nums[0]){
                ans = nums[mid];
                s = mid +1;
            }else{

                e = mid -1;
            }

        }
        return ans ;
    }
}
