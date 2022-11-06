package com.varun;

public class Main {

    public static void main(String[] args) {
	// write your code here
int[] order = {2,3,5,6,7,8};
int amt = 11;
int ans = noOfProducts(order,amt);
        System.out.println(ans);
    }
    public static int  noOfProducts(int[] order, int disAmount)
    {
        int  answer = 0;
        // Write your code here
        for (int i = 0; i < order.length ; i++) {
            if(order[i]>0 && disAmount%order[i]==0){
                answer++;
            }
        }
        return answer;
    }

}
