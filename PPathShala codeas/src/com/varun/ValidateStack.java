package com.varun;

import java.util.Stack;

public class ValidateStack {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int []popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack <>();
        int itpop = 0;
        int itpush = 0;
        if(st.isEmpty() && itpush < pushed.length){
            st.push(pushed[itpush]);
            itpush++;
        }
        while(!st.isEmpty() ){
            if( st.peek()!= popped[itpop] && itpush < pushed.length )
            { st.push(pushed[itpush]);
                itpush++;
            }
            else if (st.peek()== popped[itpop]){
                st.pop();
                itpop++;
            }else {
                break;
            }
        }



        return st.isEmpty();
    }
}
