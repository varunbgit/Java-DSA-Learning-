package com.varun;

import java.util.Scanner;

public class LinSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,66,4,7,87};
        int key;
        System.out.println("Enter the Key ");
        Scanner in = new Scanner(System.in);
        key = in.nextInt();
        Lsearch(arr,key);
    }

    public static void Lsearch(int[] arr,int key ){

        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at Index "+ i);
                break;
            }
        }
        System.out.println("Element not found");
    }
}
