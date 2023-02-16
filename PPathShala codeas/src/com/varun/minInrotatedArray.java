package com.varun;

public class minInrotatedArray {
    public static void main(String[] args) {
        int []arr = {3,4,5,1,2};
//        int []arr = {0,1};

        int ans =  findMin(arr);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length -1;

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

            if(nums[mid] < nums[mid +1] && nums[mid] > nums[mid -1] ){

                if(nums[mid]  >= nums[0] ){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }

            else if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid -1]){
                ans = nums[mid] ;
                break;
            }
        }
        return ans ;
    }
}
