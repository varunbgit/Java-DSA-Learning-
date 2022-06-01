package com.varun;

public class SplitSubArraySum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int m = 2;
        int minsumofSubArr = 0;
        System.out.println(Check(arr,m));
  //      minsumofSubArr = splitArray(arr, m);
        //System.out.println("The Minimum sum is " + minsumofSubArr);

    }

    private static int Check(int[] arr, int m) {
        int sumofarray=0;
        int greatestele=0;
        //int temp=-1;


        for(int num:arr){
            greatestele=Math.max(greatestele,num);
            sumofarray+=num;
        }

        int start=greatestele;
        int end = sumofarray;
        while(start<end){
            int mid = start + (end-start)/2;
            int[] subarray1 = {};
            int sumofsubarr=0;
            int pieces=1; /// because at least one array is there
            for(int num:arr){

                if((sumofsubarr + num) >mid){
                    sumofsubarr=num;
                    pieces++;
                }else{
                    sumofsubarr+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else {
               end = mid;
            }

        }

        return end ;  //here start = end
    }

}