package com.varun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums1){
          //  System.out.println(map);

            if(map.containsKey(ele)){
                int prevCount = map.get(ele);
              //  map.remove(ele);
                map.put(ele,prevCount+1);

            }else{
                map.put(ele,1);
            }
        }

        for(int ele: nums2){
            //System.out.println(map);
            if(map.containsKey(ele) && map.get(ele)>0){
                list.add(ele);
                map.put(ele,map.get(ele)-1);

            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
