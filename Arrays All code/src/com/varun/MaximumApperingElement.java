package com.varun;

import java.util.Arrays;

public class MaximumApperingElement {
    public static void main(String[] args) {
        int[]left = {1,2,5,15};
        int[]right = {5,8,7,18};
        int ans = findMaxApperingEle(left,right);
        System.out.println(ans);

    }


    private static int findMaxApperingEle(int[] left, int[] right) {
        //because the given constraint maximum range can be from 0 to 100;
        int []freq  = new int[100];
        for (int i = 0; i <left.length ; i++) {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
       // System.out.println(Arrays.toString(freq));

        //compute the prefix sum of the freq arr and return the index with max count

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }
        int maxIndex = -1;
        int maxValue =  Integer.MIN_VALUE;
        for(int i=0;i< freq.length;i++){
            if(freq[i]>maxValue){
                maxValue = freq[i];
                maxIndex = i;
            }
        }
       // System.out.println(Arrays.toString(freq));
        return maxIndex;
    }
}
