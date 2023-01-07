package com.varun;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_Ndivide3 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,2,2,2};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans.toString());
    }

    public static List<Integer> majorityElement(int[] nums) {

        int num1 = -1;
        int num2 = -1;
        int c1  =0 ;
        int c2 = 0;
         // here we can have maximum of 2 majority elements

        for(int ele : nums){
            if(num1 == ele ){
                c1++;
            }
            else if(num2 == ele ){
                c2++;
            }else if(c1 ==0 ){
                num1 = ele;
                c1 =1;
            }else if(c2 == 0){
                num2 = ele;
                c2 = 1;
            }else{
                c1 -- ;
                c2 -- ;
            }
        }

        // our majority element are nums1  and num2
        //but we are not sure if array array contains elements greater than n/3 times .

        // so to confirm
        int n1 = 0;
        int n2 = 0;
        for (int ele : nums){
            if(ele == num1){
                n1++;
            }else if(ele == num2){
                n2++;
            }
        }
        List<Integer> ls  = new ArrayList<>();
        if(n1 > nums.length/3){
            ls.add(num1);
        }if(n2 > nums.length/3){
            ls.add(num2);
        }

        return ls;
    }
}
