package com.varun;

import java.util.ArrayDeque;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};
        nextGreater(arr, arr.length);
    }

    public static void nextGreater(int[] arr,int n){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = n-1; i >= 0; i--) {
            while (true){
                if(stack.isEmpty()){
                    System.out.println(-1);
                    break;
                }
                if(stack.peek()>arr[i]){
                    System.out.println(stack.peek());
                    break;
                }else{
                    stack.pop();
                }

            }
            stack.push(arr[i]); //code works fine if output req in reverse order store in a ArrayList and Reverse it .

        }
    }
}
