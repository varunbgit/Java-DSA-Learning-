package com.varun;

import java.util.ArrayList;

public class LinerSearchWithMultipleApp {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,4,5};
//        search(arr,4,0);
       // System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> ans = search2(arr,4,0,  list);
        System.out.println(ans);

    }


    static ArrayList <Integer> list  = new ArrayList<>();
    static void search(int [] arr ,int key,int index){

        if(index == arr.length){
            return;
        }
        if(arr[index] ==key){
            list.add(index);
        }

         search(arr,key,index+1);

    }
    //what if we don't want to make a static list outside the function


//    static ArrayList<Integer> search2(int [] arr , int key, int index, ArrayList <Integer> list){
//         return helper(arr,key,index,list);
//    }

    private static ArrayList search2(int[] arr, int key, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] ==key){
            list.add(index);
        }

        return search2(arr,key,index+1,list);
    }


    private static ArrayList<Integer> search3(int [] arr ,int key,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index== arr.length){
            return list;
        }
        if(index == key ){
            list.add(index);
        }

        ArrayList<Integer> ansfrombelow = search3(arr,key,index+1);
        list.addAll(ansfrombelow);
        return list;

    }

}
