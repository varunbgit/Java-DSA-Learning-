package com.varun;

import java.util.Arrays;
import java.util.Comparator;

public class CHOCOLA_greedy {
    public static void main(String[] args) {
        Integer [] vcut = {2,1,3,1,4};
        Integer [] hcut = {4,1,2};
        int n = 4;
        int m = 6;
        int cost = minCost(n,m,vcut,hcut);
            System.out.println(cost);
    }

    public static int minCost(int n,int m,Integer []vcut,Integer []hcut){

        int vpieces = 1;
        int hpeices = 1;
        int vpointer =0;
        int hpointer = 0;
        int cost = 0;
        Arrays.sort(vcut,Comparator.reverseOrder());
        Arrays.sort(hcut,Comparator.reverseOrder());

        System.out.println(Arrays.toString(vcut));
        System.out.println(Arrays.toString(hcut));

        while(vpointer < m-1 && hpointer<n-1){
            if(vcut[vpointer] > hcut[hpointer]){
                //vertical cut
                cost += hpeices * vcut[vpointer];
                vpointer++;
                vpieces++;

            }else{
                //horizontal cut
                cost += vpieces * hcut[hpointer];
                hpeices++;
                hpointer++;
            }
        }

        while (vpointer < m-1) {
            cost += hpeices * vcut[vpointer];
            vpointer++;
            vpieces++;
        }
        while (hpointer<n-1){
            cost += vpieces * hcut[hpointer];
            hpeices++;
            hpointer++;
        }

        return cost;


    }
}
