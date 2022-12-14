package com.varun;

public class LeaderInArray {
    public static void main(String[] args) {
//        int []arr ={7,10,4,10,6,5,2};
        int []arr ={7,10,4,5,6,5,2};
        leader(arr);


    }
    public static void leader(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>max){
                System.out.println(arr[i]);         // this approach is printing the answer in reverse order we can store in a
                max = arr[i];                   //in a arraylist and reverse it
            }
        }
    }
}
