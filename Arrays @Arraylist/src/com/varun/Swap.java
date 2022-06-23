package com.varun;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
	// write your code here
        int [] arr=new int[5];

        Scanner in = new Scanner(System.in);
        Getdata(arr);
        Swap(arr,1,3);
        Showdata(arr);

    }

    public static void Getdata(int ar[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values for Array");

        for (int i=0;i<5;i++){
            ar[i]= in.nextInt();
        }
    }
    public static void Swap(int a[],int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }

    public static void Showdata(int arr[]) {
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
