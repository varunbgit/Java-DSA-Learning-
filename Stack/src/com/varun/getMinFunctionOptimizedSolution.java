package com.varun;

import java.util.ArrayDeque;
// keeping the constraint as all pushed value are positve

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

    public static void push(ArrayDeque<Integer>stack, int ele ){
        if(stack.isEmpty()){

            min = ele;
            stack.push(ele);
        }
        else{
            if(ele <= min){     // this condition handles the case of a mini ele getting pushed again.
                stack.push(ele - min);
                min = ele ;
            }
            else{
                stack.push(ele);
            }

        }
    }

    public static void pop(ArrayDeque<Integer>stack){
        if(stack.peek() <= 0 ){
            min = min - stack.peek();
        }
        stack.pop();
    }

}
