package com.varun;
//1346. Check If N and Its Double Exist

public class Checkifdoubleexits {
    public static void main(String[] args) {
    int [] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==2*arr[j]) || (arr[j]==2*arr[i])){
                        return true ;
                    }
            }
        }
        return false;
    }
}
