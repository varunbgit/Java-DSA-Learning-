package com.varun;

public class ProductOfNumsRecursion {
    public static void main(String[] args) {
        int x = 5;
        int y = 55;
        int ans = product(x,y);
        System.out.println(ans);
    }

    public static int product(int x, int y) {
        // Assuming x is greater and  y is smaller

        if(x > y){
//            int temp = x;
//            x= y;
//            y = temp;
            return product(y,x);
        }
        if(x==0 || y==0){
            return 0;
        }

        return x + product(x,y-1);

    }
}
