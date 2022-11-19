package com.varun;

import java.util.ArrayDeque;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {13,15,12,14,16,8,6,4,10,30};
        stockSpan(arr);
    }
    public static void stockSpan(int[] arr){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        stack.push(0);      // we are pushing index of ele so that it is easy to search the element
        System.out.println(1);

        for (int i = 1; i <n ; i++) {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            int val = stack.isEmpty()?i+1:(i- stack.peek());
            System.out.println(val);
            stack.push(i);
        }
    }


}
