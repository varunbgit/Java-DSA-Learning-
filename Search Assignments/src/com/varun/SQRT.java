package com.varun;


//69. Sqrt(x)

import java.util.ArrayList;
import java.util.Scanner;

public class SQRT {

    public static void main(String[] args) {
	// write your code here
        int num=2147395599;
//        System.out.println("Enter a number ");
//        Scanner in = new Scanner(System.in);
//        num  = in.nextInt();
        int directAns = (int)(Math.sqrt(num));
        System.out.println(mySqrt(num));

    }

    /*
        The question don't seems to be a Binary search question directly
        but this a question of Binary search
        I'll tell you how
        But we know that the ans is going to be a integer and it is going to be regular

        and now all the number are in ascending order

        ex sqrt(10) is going to be somewhere in between 1,2,3,4,5,6,7,....
        dont worry about the decimal as we have  to return int value.

     */
    public static  int mySqrt(int x) {

        //int[] arr = new int[x/2 +1];
        ArrayList<Integer> arrayList = new ArrayList<>() ;
        if(x==0 || x==1){
            return x;
        }
        else{
          for (int i = 0; i < x/2 +1 ; i++) {
              arrayList.add(i);
          }
        }
        int start=0;
        int end = arrayList.size() -1 ;
        int mid =0;
        while (start<=end){
            mid = start + (end-start)/2;
            if( arrayList.get(mid)*arrayList.get(mid)==x){
                return arrayList.get(mid);
            }
            if(arrayList.get(mid)*arrayList.get(mid) <x){
                start  = mid+1 ;
            }
            else if(arrayList.get(mid)*arrayList.get(mid) > x){
                end = mid-1;
            }
        }
        return arrayList.get(end);
    }
}
