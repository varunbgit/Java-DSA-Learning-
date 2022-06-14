package com.varun;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,5,7,9,45,65,76,78,82};
        System.out.println("Enter the key ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Bsearch(array,num);
    }
    public static void Bsearch(int[] arr,int key){
        int s= 0;
        int e=9;

        while(s<e){
            int mid=(s+e)/2;
            if(key==arr[mid]){
                System.out.println("Element found at index "+mid);
                break;
            }
            if(key>arr[mid]){
                s=mid+1;
            }
            if(key<arr[mid]){
                e=mid-1;
            }
        }
        System.out.println("Element not found ");


    }
}
