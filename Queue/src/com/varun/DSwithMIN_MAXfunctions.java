package com.varun;

import java.util.ArrayDeque;

public class DSwithMIN_MAXfunctions {
    public static class functions{
         static ArrayDeque<Integer> deque = new ArrayDeque<>();

        static void insertMin(int ele){
            //insert at front end
            deque.addFirst(ele);
        }
        static void insertMax(int ele){
            deque.addLast(ele);
        }
        static void getMin(){
            System.out.println(deque.getFirst());
        }
        static void getMax(){
            System.out.println(deque.getLast());
        }
    }
    public static void main(String[] args) {
        functions.insertMin(5);
        functions.insertMax(10);
        functions.insertMin(3);
        functions.insertMax(15);
        functions.insertMin(2);
        functions.getMax();
        functions.getMin();

    }
}
