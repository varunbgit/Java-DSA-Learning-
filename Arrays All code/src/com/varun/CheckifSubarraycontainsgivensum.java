package com.varun;

public class CheckifSubarraycontainsgivensum {
    public static void main(String[] args) {
        int [] arr ={1,4,20,3,10,5};
//        int [] arr ={3,2,0,4,7};

        int sum =33;
        boolean ans = checkSum(arr,sum);
        System.out.println(ans);
    }

    private static boolean checkSum(int[] arr, int sum) {
        //optimized approach
        int currSum =0;
        int sIndex =0;

        for (int i = 0; i < arr.length ; i++) {
           currSum+=arr[i];
           while (currSum>sum){
               currSum -= arr[sIndex];
               sIndex++;
           }
            if(currSum==sum){
                return true;
            }
        }
        return false;
    }
}
