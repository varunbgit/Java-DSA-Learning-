package com.varun;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class RevelCards {
    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] ans = deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(ans));
    }
    public static class pair{
        int val = -1;
        int index;
        public pair(int v,int i){
            index = i;
            val = v;
        }
    }
    public static int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
        Queue<pair> q = new ArrayDeque<>();
        for(int i =0;i<deck.length;i++){
            q.add(new pair(-1,i));
        }

        int i = 0;
        int []ans = new int[deck.length];

        while(i<deck.length){
            ans[q.peek().index] = deck[i];
            q.remove();
            pair ele = q.peek();
            if(ele != null) {
                q.add(ele);
                q.remove();
            }
            i++;
        }


        return ans;
    }
}
