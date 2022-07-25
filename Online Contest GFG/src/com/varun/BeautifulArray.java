package com.varun;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BeautifulArray {
    public static void main(String[] args) {
        int[] arr ={-3 ,-1 ,-19, 0, 6, -13, 12};
       // int[] arr ={2 ,1 ,-4 ,3 ,-5 ,2 ,6 ,-3};
        ArrayList<Integer> beautiful = makeBeautiful(arr);
        System.out.println(beautiful.toString());
    }
//
//    public static ArrayList<Integer> makeBeautiful(int[] arr) {
//        // code here
//      //  ArrayList <Integer> finallist = new ArrayList<Integer>();
//
//        ArrayList <Integer> arrayList = new ArrayList<Integer>();
//
//        for (int ele:arr) {
//            arrayList.add(ele);
//        }
//
//           int i =0 ;
//
//        while(i < arrayList.size()-1) {
//
//        boolean ele1 = isPos(arrayList.get(i));
//        boolean ele2= isPos(arrayList.get(i+1));
//
//            if (ele2 ^ ele1 ) {
//                arrayList.remove(i);
//                arrayList.remove(i); // because this is arraylist and as soon as we delete ele at i the element at i+1 comes at i
//                System.out.println(arrayList.toString());
//            } else {
//                i++;
//            }
//        }
//
//        //checking that if last and second last are of same sign
//        boolean ele1 = isPos(arrayList.get(arrayList.size()-1));
//        boolean ele2 = isPos(arrayList.get(arrayList.size()-2));
//        if (ele2 ^ ele1 ) {
//            arrayList.remove(arrayList.size()-1);
//            arrayList.remove(arrayList.size()-1); // because this is arraylist and as soon as we delete ele at i the element at i+1 comes at i
//         //   System.out.println(arrayList.toString());
//        }
//        return arrayList;
//
//    }
//
//    private static boolean isPos(Integer num) {
//        if(num>=0){
//            return true;
//        }
//        return false;
//    }

    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            //check is true then opp signs
             if(list.size() == 0){
                        list.add(arr[i]);
             }else{
                 if(check(list.get(list.size() - 1), arr[i])){
                     //here both ele are of opp sign
                     list.remove(list.size()-1);
                 }
                 else{
                     list.add(arr[i]);
                 }
             }
        }
        return list;


    }

    private static boolean check(int a, int b) {
        return (a>=0 && b<0) || (a<0 && b>=0);
    }

}
