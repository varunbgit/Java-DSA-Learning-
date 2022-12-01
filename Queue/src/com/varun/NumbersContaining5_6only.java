package com.varun;

import java.util.ArrayDeque;

public class NumbersContaining5_6only {
    public static void main(String[] args) {
        int val = 5;
        printNumbers(val);
    }

    private static void printNumbers(int val) {
        ArrayDeque<String > queue = new ArrayDeque<>();
        queue.addLast("5");
        queue.addLast("6");
//        queue.removeFirst();
    //    System.out.println(queue);
        for(int i=0;i<val;i++){
             String removedItem =queue.removeFirst() ;
            System.out.println(removedItem);
             String val1 = removedItem + '5';
             String val2 = removedItem+ '6';
             queue.addLast(val1);
             queue.addLast(val2);

        }
    }
}
