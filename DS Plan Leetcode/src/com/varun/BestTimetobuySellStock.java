package com.varun;

public class BestTimetobuySellStock {
    public static void main(String[] args) {
        int [] prices = {2,4,1};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]>maxVal){
                maxIndex = i;
                maxVal = prices[i];
            }
        }
        int minValue = maxVal;
        for (int i = maxIndex -1; i >=0 ; i--) {
            if (minValue>prices[i]){
                minValue = prices[i];
            }
        }
        if(maxVal != minValue){
            return maxVal - minValue;
        }
        return 0;
    }
}
