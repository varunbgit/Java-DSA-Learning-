package com.varun;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
//        int [] arr = {10,90,100,100,20,200};
//        int [] arr = {10,90,100,100,200,200};
        int [] arr = {100,100,100,200,200};
        boolean ans = checkSorted(arr);
        System.out.println(ans);
    }

    private static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
