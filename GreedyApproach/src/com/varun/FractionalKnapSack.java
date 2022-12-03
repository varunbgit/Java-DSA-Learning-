package com.varun;

public class FractionalKnapSack {
    public static void main(String[] args) {
        Item [] arr = {new Item(10,60),new Item(40,40),new Item(20,100),new Item(30,120)};
        int w = 50;
        System.out.println(fractionalKnapSack(arr,w));
    }

    private static double fractionalKnapSack(Item[] arr, int w) {

    }

}
public class Item implements Comparable<Item>{
    int wt ,val ;
    public Item(int w,int v){
        wt = w;
        val = v;
    }
public int compareTo(Item i){
    return wt * i.val - val*i.wt;
}
}
