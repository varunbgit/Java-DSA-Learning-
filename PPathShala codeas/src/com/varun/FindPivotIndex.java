package com.varun;

public class FindPivotIndex {
    public static void main(String[] args) {
        int [] nums= {1,7,3,6,5,6};
        int ans = pivotIndex(nums);
        System.out.println(ans );
    }
    public static int pivotIndex(int[] nums) {
        int arrSum = 0;
        for(int ele : nums){
            arrSum += ele;
        }

        int lsum = 0;
        int rsum = arrSum - nums[0];
        if(lsum == rsum ){
            return  0;
        }
        for(int i =1;i<nums.length;i++){
            lsum += nums[i-1];
            rsum -=  nums[i];

            if(lsum == rsum){
                return i;
            }
        }

        return -1;

    }
}
