package com.varun;


import java.util.Scanner;

public class Find_the_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        char [] arr={'c','f','j'};
        System.out.println("Enter the target value");
        char target = in.next().charAt(0);
        System.out.println("The Ceil character is "+ check(arr,target));

    }

    public static char check(char [] arr, char target){
        if(target>arr[arr.length -1])
            return arr[0];

        int start=0;
        int end = arr.length -1;
        int mid=0;

        while (start<=end ){
            mid= start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start =  mid+1;
            }else{
                break;
            }
        }
        return arr[mid +1];
    }
}
