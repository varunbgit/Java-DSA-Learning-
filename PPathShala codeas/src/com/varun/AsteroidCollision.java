package com.varun;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        int []ans = asteroidCollision(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for(int i =0;i<n;i++){
            if(!st.isEmpty()){
                if(arr[i] * st.peek() < 0){
                    while(!st.isEmpty()){
                        int ele =st.peek();
                        ele = ele<0?ele*-1:ele;
                        arr[i] = arr[i]<0?arr[i]*-1:arr[i];
                        if(ele <= arr[i]){
                            st.pop();
                        }else {
                            break;
                        }
                    }
                    continue;
                }
            }
            st.push(arr[i]);
        }
        int [] ans = new int[st.size()];
        int i =0;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i++;
        }
        int[] b = new int[ans.length];
        int j =ans.length;
        for (int k = 0; k < ans.length; k++) {
            b[j - 1] = ans[k];
            j = j - 1;
        }

//
//        ArrayDeque<Integer> dq = new ArrayDeque<>(10);
//        dq.size();
//        dq.capacity();

return new int[]{};
    }
}
