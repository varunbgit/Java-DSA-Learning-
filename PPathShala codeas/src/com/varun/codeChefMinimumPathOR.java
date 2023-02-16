package com.varun;

import java.util.Scanner;

public class codeChefMinimumPathOR {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test >0){
            test--;
            int n = in.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }

            int ans = or(arr,n);
            System.out.println(ans);
        }
    }

    public static int or(int [] nums,int n){
        int index = 1;
        int ans = nums[0];
        boolean [] visited = new boolean[n];
        while(index <= n){
            if(!visited[index-1]){

                visited[index-1] = true;
                ans = ans | nums[index-1];
                int newi = Math.min(index + nums[index-1] , n);

                if(index != newi){

                    index = newi;
                }else{
                    return -1;
                }

            }
        }
        if(visited[n-1]){
            return ans;
        }
        return -1;
    }
}
