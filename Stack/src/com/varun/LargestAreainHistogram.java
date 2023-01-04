package com.varun;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class LargestAreainHistogram {
    public static void main(String[] args) {
//        int[] heights = {2,1,5,6,2,3};
//        int[] heights = {6,2,5,4,1,5,6};
        int[] heights = {0,0};
        int ans  =largestRectangleArea(heights);
        System.out.println(ans);
    }
    public static int  largestRectangleArea(int[] heights) {
        int res = 0 ;
        int[] pmin = new int[heights.length];
        int[] nmin = new int[heights.length];
        Stack<Integer> stP = new Stack<>();
        Stack<Integer> stN = new Stack<>();
        //calculating pmin  & nmin ;

        for(int i =0;i< heights.length;i++) {
            //pmin
            while(true){

                if (!stP.isEmpty() && heights[stP.peek()] < heights[i]) {
                    pmin[i] = stP.peek();
                    break;
                }
                while (!stP.isEmpty() && heights[stP.peek()] >= heights[i]) {
                    stP.pop();
                }

                if (stP.isEmpty()) {
                    pmin[i] = -1;
                    break;
                }


            }
            stP.push(i);
        }
        //nmin
        for(int i = heights.length-1 ; i>=0;i--){

            while(true) {

                if (stN.isEmpty()) {
                    nmin[i] = heights.length;
                    break;
                }

                if (!stN.isEmpty() && heights[stN.peek()] < heights[i]) {
                    nmin[i] = stN.peek();
                    break;
                }

                while (!stN.isEmpty() && heights[stN.peek()] >= heights[i]) {
                    stN.pop();
                }
//                if(!stN.isEmpty() && heights[stN.peek()] > heights[i]){
//                    nmin[stN.peek()] = i;
//                    break;
//                }
            }
            stN.push(i);

        }


        System.out.println("pmin is : " + Arrays.toString(pmin));
        System.out.println("nmin is : " + Arrays.toString(nmin));
//
//
//        //calculating the largest area

        for (int i = 0; i <heights.length ; i++) {
            int curr  = heights[i];
            curr  += (i - pmin[i] -1)* heights[i] ;
            curr  += (nmin[i] - i -1)* heights[i];
            res = Math.max(res,curr);
        }

        return res;
    }
}

