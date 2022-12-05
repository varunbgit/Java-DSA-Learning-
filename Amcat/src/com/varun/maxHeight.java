package com.varun;

import java.util.Scanner;

public class maxHeight {
    public static void main(String[] args) {
        int length = 6;
        int[] height  = {10,6,8,4,12,9};
        int noQueries = 6;
        Scanner in  = new Scanner(System.in);
        for (int i = 0; i <noQueries ; i++) {
            System.out.println("Enter the ith person");
            int index = in.nextInt();
            index--;

            if(index == length-1){
                System.out.println(0);
            }else{
                int count  = 0;

                for(int j=index +1;j<length;j++){
                    if(height[index]>=height[j]){
                        count++;
                    }
                    else{
                        if(count ==0){
                            count++;
                        }
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}
