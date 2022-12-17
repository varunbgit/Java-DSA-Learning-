package com.varun;

public class MamimumLenghtAlternateOddEvenSubarray {
    public static void main(String[] args) {
//        int []arr = {10,12,14,7,8};
        int []arr = {5,6,20,6,3,8};
        int ans =maxLength1(arr);
        System.out.println(ans);
    }

    private static int maxLength(int[] arr) {
        //Naive Method
        int maxcount =1;
        for (int i = 0; i < arr.length ; i++) {
            int count = 1;
            for (int j = i+1; j <arr.length ; j++) {

                //first ele is odd
                if((arr[j]%2==0 && arr[j-1]%2==1) || (arr[j]%2==1 && arr[j-1]%2==0)) {
                    count++;
                }else{
                    break;
                }

            }
            maxcount= Math.max(maxcount,count);
        }
        return maxcount;
    }

    private static int maxLength1(int[] arr) {
        //optimized approach
        int max = 1;
        int curr=1 ;
        for (int j = 1; j <arr.length ; j++) {
            if((arr[j]%2==0 && arr[j-1]%2==1) || (arr[j]%2==1 && arr[j-1]%2==0)){
                curr++;
            }
            else{
                curr=1;
            }
            max = Math.max(curr,max);
        }
        return max;
    }


}
