package com.varun;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseTheQueue {
    public static void main(String[] args) {
        Queue<Integer> q  = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        reverse1(q);
        System.out.println(q);

    }
    public static void reverse1(Queue<Integer> q ){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
}
