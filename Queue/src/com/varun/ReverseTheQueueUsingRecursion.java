package com.varun;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseTheQueueUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> q  = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }

    private static void reverse(Queue<Integer> q) {
        if(q.isEmpty()){
            return;
        }
        int x = q.remove();
        reverse(q);
        q.add(x);
    }
}
