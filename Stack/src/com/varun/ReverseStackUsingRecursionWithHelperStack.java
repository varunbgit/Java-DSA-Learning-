package com.varun;

import java.util.ArrayDeque;

// Given a stack containing elements
//reverse the elements and finally place them in the stack itself not in the Helper Stack.

public class ReverseStackUsingRecursionWithHelperStack {
    public static void main(String[] args) {
        int[] arr = {9,1,7,6,5};
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int ele:arr){
            stack.push(ele);
        }
        ArrayDeque<Integer> helper = new ArrayDeque<>();
        while(stack.isEmpty()){
            int ele = stack.pop();
            helper.push(ele);
        }
        reverseStack(stack,helper);
        System.out.println(stack);
    }

    private static void reverseStack(ArrayDeque<Integer> stack, ArrayDeque<Integer> helper) {
        if(helper.isEmpty()){
            return ;
        }
        int ele = helper.pop();
        reverseStack(stack,helper);
        stack.push(ele);

    }
}
