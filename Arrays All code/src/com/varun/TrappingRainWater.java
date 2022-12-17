package com.varun;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {3,0,1,2,5};
//        int water = findWater(heights);
        int water = findWater2(heights);
        System.out.println(water);
    }

    //approach 1 o(n^2)
    private static int findWater(int[] heights) {
        int water =0;
        for (int i = 1; i < heights.length-1; i++) {    //ignoring the last 2 indices because we can't store anything before or after that
            //find the lmax
            int lmax = heights[i];
            for (int j = 0; j<i; j++) {
                lmax= Math.max(heights[j], lmax);
            }

            //find the rmax
            int rmax = heights[i];
            for (int j = i+1; j < heights.length ; j++) {
                rmax= Math.max(heights[j], rmax);
            }

            water += Math.min(lmax,rmax) - heights[i];  // this will tackle the situation even when the ele is max and no lmax or rmax exists.
        }
        return water;
    }

    //optimized theta(n);
    private static int findWater2(int[] heights) {
        //we will precompute the lmax and rmax
        int water= 0;
        int[] lmax = new int[heights.length];
        int[] rmax = new int[heights.length];

        lmax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            lmax[i]= Math.max(heights[i],lmax[i-1]);
        }

        rmax[heights.length-1] = heights[heights.length-1];
        for (int i = heights.length-2;i >=0;i--) {
            rmax[i]= Math.max(heights[i],rmax[i+1]);
        }
//        System.out.println(Arrays.toString(lmax));
//        System.out.println(Arrays.toString(rmax));

        // time to compute the ans

        for (int i = 0; i < heights.length; i++) {
            water += Math.min(lmax[i],rmax[i]) - heights[i];
        }
        return water;
    }
}
