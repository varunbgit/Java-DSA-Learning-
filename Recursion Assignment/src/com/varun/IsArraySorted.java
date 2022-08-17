package com.varun;

public class IsArraySorted {
    public static void main(String[] args) {
        int [] arr ={ 20 ,20 ,78 ,98 ,99, 97};
        boolean ans  = check(arr,1);
        System.out.println(ans);
    }

    private static boolean check(int[] arr,int s) {
        if(s == arr.length ){
            return true;
        }
        if(arr[s-1]>arr[s]){
            return false;
        }
        return check(arr, s + 1);
    }


}
