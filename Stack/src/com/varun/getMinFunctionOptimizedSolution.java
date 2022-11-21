package com.varun;

import java.util.ArrayDeque;


public class getMinFunctionOptimizedSolution {


    public static int min ;

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        push(stack,10);
        push(stack,20);
        push(stack,2);
        push(stack,6);
        push(stack,4);
        pop(stack);
        pop(stack);
        push(stack,2);
        pop(stack);
        push(stack,1);
        pop(stack);
        pop(stack);


    }

//    // ***    keeping the constraint as all pushed value are positve ***

//    public static void push(ArrayDeque<Integer>stack, int ele ){
//        if(stack.isEmpty()){
//
//            min = ele;
//            stack.push(ele);
//        }
//        else{
//            if(ele <= min){     // this condition handles the case of a mini ele getting pushed again.
//                stack.push(ele - min);
//                min = ele ;
//            }
//            else{
//                stack.push(ele);
//            }
//
//        }
//    }
//
//    public static void pop(ArrayDeque<Integer>stack){
//        if(stack.peek() <= 0 ){
//            min = min - stack.peek();
//        }
//        stack.pop();
//    }









    //      *** Handles Negative Numbers being pushed ***

    public static void push(ArrayDeque<Integer>stack, int ele ){
        if(stack.isEmpty()){

            min = ele;
            stack.push(ele);
        }
        else{
            if(ele <= min){     // this condition handles the case of a mini ele getting pushed again.
                stack.push(2* ele - min);   //here we can say that we have pushed element less than equal to ele
                min = ele ;                    // this thing will be useful to check in case of POP operations.
            }
            else{
                stack.push(ele);
            }

        }
    }

    public static void pop(ArrayDeque<Integer>stack){
        if(stack.peek() <= min){   // this is the condition we have talked about in push operation
            System.out.println("poped value is  " + min);
            min = 2*min - stack.peek();

        }
        stack.pop();
    }





}
