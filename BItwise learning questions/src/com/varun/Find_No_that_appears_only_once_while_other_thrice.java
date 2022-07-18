package com.varun;

import java.util.ArrayList;
import java.util.List;

public class Find_No_that_appears_only_once_while_other_thrice {
    public static void main(String[] args) {
        int [] arr = {2,2,3,2,7,7,8,7,8,8};
        int ans  = find(arr);
        System.out.println(ans);
    }

     static int find(int[] arr) {
        List<Integer> sumArray = new ArrayList();
        for (int ele : arr){
            String binary = Integer.toBinaryString(ele); // converting number to binary digit but ans comes in string
            sumArray.add(Integer.parseInt(binary));//convert string to int
        }
        int sum=0;
        for(int ele:sumArray){
            sum = sum + ele;
        }

        //Taking the digit one by one and dividing by n
         StringBuilder ans = new StringBuilder();
         while(sum>0){
             int digit = sum % 10;
             ans.append(digit % 3);
             sum = sum/10;
         }
         // now just reverse the string and ans is in binary convert to int and print it

         ans.reverse();     //  0011


         String str = ans.toString();
        // int finalint = Integer.parseInt(str);
         return Integer.parseInt(str,2);

    }
}
