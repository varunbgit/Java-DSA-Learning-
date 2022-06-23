package com.varun;
// 350. Intersection of Array 2
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class IntersectionofArray2 {
    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //int [] output=new int[Math.max(nums2.length, nums1.length)];
//        int index=0;


        /* Twist
        * [1,2,2,1]
            [2]
            * output comes [2,2]
            * but output should be [2];
            *
            * We need to reduce the array Space of nums1
        */

        List<Integer> output = new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            if(BinarySearch(nums1[i],nums2)){
                output.add(nums1[i]);

            }

        }

        //LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        //int[] ints =  new int[output.size()];
        ;
//        for(int ele : output){
//            hs.add(ele);
//            //ints[index] = ele;
//            //  index++;
//        }

        //Coverting from List to Array as return type is Int[]
        int index =0;
        int[] ints = new int[output.size()];
        for(int ele:output){
            ints[index] = ele;
            index++;
        }
        return ints ;
    //    return  output;
    }

    public static boolean BinarySearch(int key,int[] nums2){
            Arrays.sort(nums2);
            int start =0;
            int end = nums2.length - 1;

            while (start <= end) {
                int mid = end - (end - start) / 2;
                if (nums2[mid] == key) {
                    nums2[mid] =-1;
                    return true;
                } else if (nums2[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return false;
    }

}
