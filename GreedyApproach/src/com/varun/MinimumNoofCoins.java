package com.varun;

import java.lang.reflect.Array;
import java.util.*;

public class MinimumNoofCoins {
    public static void main(String[] args) {
        int[] coins = {10,2,5,1};
        int val = 52;
        int ans = minimumCoins(coins,val);
        System.out.println(ans);
    }

    private static int minimumCoins(int[] coins, int val) {
        Arrays.sort(coins);
        int n  = coins.length;
        int[] reversedCoins = new int[coins.length];
        for (int i = 0; i <coins.length ; i++) {
            reversedCoins[i] = coins[coins.length-1-i];
        }
        coins = reversedCoins;
        System.out.println(Arrays.toString(coins));
        int res = 0;
        for (int i = 0; i <coins.length ; i++) {

            if(val>=coins[i]){
                int c = (int)(Math.floor(val/coins[i]));
                res = res + c;
                val = val - c * coins[i];
            }
            if(val == 0){
                break;
            }
        }
        return res;
    }
}
