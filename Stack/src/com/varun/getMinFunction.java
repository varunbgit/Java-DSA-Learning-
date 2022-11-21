package com.varun;

import java.util.ArrayDeque;

public class getMinFunction {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> helper = new ArrayDeque<>();
        push(stack,helper,20);
        push(stack,helper,10);

        System.out.println(getMin(stack,helper));

        push(stack,helper,5);

        System.out.println(getMin(stack,helper));

        pop(stack,helper);

        System.out.println(getMin(stack,helper));

        pop(stack,helper);

        System.out.println(getMin(stack,helper));
    }

    public static void push(ArrayDeque<Integer>stack,ArrayDeque<Integer> helper,int ele){
        if(helper.isEmpty()){
            helper.push(ele);
        }
        if(helper.peek()>ele){
            helper.push(ele);
        }

        stack.push(ele);
    }
    public static void pop(ArrayDeque<Integer> stack,ArrayDeque<Integer> helper){
        if(stack.peek() > helper.peek()){
            stack.pop();
        }
        else{
            stack.pop();
            helper.pop();
        }
    }
    public static int getMin(ArrayDeque<Integer> stack,ArrayDeque<Integer> helper){
        if(helper.isEmpty())
            System.out.println("Stack Empty");

        return helper.peek();

    }

}
