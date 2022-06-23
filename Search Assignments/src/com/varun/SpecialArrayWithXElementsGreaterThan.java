package com.varun;
//1608. Special Array With X Elements Greater Than or Equal X
public class SpecialArrayWithXElementsGreaterThan {
    public static void main(String[] args) {
        int [] arr = {0,0};
        int ans = specialArray(arr);
        System.out.println(ans);
    }
    public static int specialArray(int[] nums) {
        int length = nums.length;

        for(int i=0;i<=length;i++){
            int count =0;
            for(int ele:nums){
                if(ele>=i){
                    count++;
                }
            }
            if(count == i){
                return i;
            }
        }
        return -1;
    }
}
