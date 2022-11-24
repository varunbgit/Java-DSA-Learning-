package com.varun;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr ={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
//        int value =0;
//        for(int ele :nums){
//            value = value^ele;
//            if(value == 0){
//                return true;
//            }
//        }
//        return false;
//    } fails because 1^2 == 3 3^3 gives 0


        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if (set.contains(ele)) {

                return true;
            }

            set.add(ele);

        }
        return false;
    }
}
