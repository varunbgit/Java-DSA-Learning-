package com.varun;
//1342. Number of Steps to Reduce a Number to Zero
public class Number_of_steps {
    public static void main(String[] args) {
        int num = 14;
        int ans = numberOfSteps(num);
        System.out.println(ans);
    }
    public static int numberOfSteps(int num) {
       return helper(num,0);
    }

    public static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0 ){

            return helper(num/=2,count+1);

        }
        else{

            return helper(num-1,count+1);
        }
    }
}
