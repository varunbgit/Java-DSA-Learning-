package com.varun;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,28,20};
        int key = 20;
        int index = search(arr,key,0);
        System.out.println(index);
    }
    static int  search(int[] arr, int key,int index){
        if(index == arr.length ){
            return -1;
        }
        if( arr[index]==key){
            return index;
        }
        else{
            return search(arr,key,index +1);
        }

    }
}
