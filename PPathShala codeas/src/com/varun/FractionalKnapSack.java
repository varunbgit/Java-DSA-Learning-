package com.varun;

import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

public class FractionalKnapSack {



    double fractionalKnapsack(int W, Item arr[], int n)
    {
//        Arrays.sort(arr,Comparator.comparingDouble(x-> x.value/x.weight));
        Arrays.sort(arr,Comparator.comparingDouble(o->(double)(o.value/o.weight)));
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i].value + " " + arr[i].weight);
        }
        double leftW  = W;
        double tVal = 0;
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return 0;
            }
        });
//        for (int i = 0; i <n ; i++) {}
        for (int i = n-1; i >=0 ; i--) {
            tVal += Math.min(W,arr[i].weight) * (double)(arr[i].value);
            W -= Math.min(W,arr[i].weight);
        }
        int i = 0;


        return tVal;


    }

}
