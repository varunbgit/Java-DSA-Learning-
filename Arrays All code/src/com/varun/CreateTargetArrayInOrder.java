package com.varun;

import java.util.Arrays;

// 1389. Create Target Array in the Given Order
public class CreateTargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};

        int [] ans =new int [nums.length];
        ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(output[index[i]]==0){
                output[index[i]]=nums[i];
            }else{
                //rightward shift of array from particular index
                for(int j=i;j+1<output.length ;j++){
                    int temp=output[j+1];
                    output[j+1]=output[j];
                    output[j+2]=temp;
                }
                //insertion of new value at the index
                output[index[i]]=nums[i];
            }
        }

        return output;
    }
}
