package com.varun;

public class Maximum1inSubarrya {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1,0,1,1};
//        int [] arr ={1,1,1,1};
        int ans = findMax1(arr);
        System.out.println(ans);
    }

    private static int findMax1(int[] arr) {
        int maxCount = 0;
        int count =0;

        for(int ele:arr){
            if(ele ==1){
                count++;
            }
            else{
                count =0;
            }
            maxCount = Math.max(maxCount,count);
        }

    return maxCount;
    }
}
