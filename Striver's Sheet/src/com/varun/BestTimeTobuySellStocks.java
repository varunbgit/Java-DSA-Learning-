package com.varun;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeTobuySellStocks {
        public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        //you are allowed to sell and buy only once.
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int res =0;
        int minPrice = Integer.MAX_VALUE;

        for (int ele : prices){
            if(ele <= minPrice){
                minPrice = ele ;
            }else{
                res = Math.max(res,ele - minPrice);
            }
        }

        return res;
    }
}
