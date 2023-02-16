package com.varun;

import java.util.HashMap;
import java.util.Scanner;

public class maximumlenghtofgivensumsubarray {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test > 0){

            test--;
            int n = in.nextInt();
            int target = in.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = in.nextInt();
            }
            int ans = maxLen(arr,target);
            System.out.println(ans);
        }
    }

    public static int maxLen(int[]arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int l = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(sum == target){
                l =  i+1;
            }
            if(!map.containsKey( sum - target)){
                map.put(sum,i);
            }else{
                int v = 0;
                l  = i - map.get(sum-target);;
            }
        }
        return l;
    }
}
