package com.varun;

import java.util.ArrayDeque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int [] arr = {20,30,10,5,15};
        int n = arr.length;
        printPreviousEle(arr,n);
    }
    public static void printPreviousEle(int[] arr ,int n){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while(true) {
                if (stack.isEmpty()) {
                    System.out.print(-1 + "->");
                    break;
                } else {
                    if (stack.peek() > arr[i]) {
                        System.out.print(stack.peek() +"->");
                        break;
                    } else {
                        stack.pop();
                    }

                }
            }
            stack.push(arr[i]);
        }
    }
}
