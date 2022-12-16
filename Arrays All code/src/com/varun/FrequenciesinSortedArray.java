package com.varun;

public class FrequenciesinSortedArray {
    public static void main(String[] args) {
//        int [] arr ={10,10,10,25,30,30};
//        int [] arr ={10,10,10};
        int [] arr = {10,20,30};
        findFreq(arr);


    }

    private static void findFreq(int[] arr) {
        int count =0;
        int val = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == val) {
                count++;
            }
            if(arr[i]!=val){
                System.out.println("The Number is " + arr[i-1] + "the frequency is " + count);
                val = arr[i];
                count =1;
            }
        }
        System.out.println("The Number is " + arr[arr.length-1] + "the frequency is " + count);

    }
}
