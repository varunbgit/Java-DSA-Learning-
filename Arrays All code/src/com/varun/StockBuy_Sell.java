package com.varun;
//this question is from gfg practice please do not compare it with leetcode , both are different
public class StockBuy_Sell {
    public static void main(String[] args) {
        int [] arr = {1,5,3,8,12};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }

    public static int maxProfit(int[] arr){
        int profit =0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] >arr[i]){
                 profit += arr[i+1]-arr[i];
            }
        }
        return profit;
    }
}
