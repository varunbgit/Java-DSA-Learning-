package com.varun;

public class SumofEachRowInPascalTriangle {
    public static void main(String[] args) {
        int rowNo = 5;
        int ans = findSum(rowNo);
        System.out.println(ans);
    }

    private static int findSum(int rowNo) {
        // its is the property of pascals triangle that sum of its row
        // nc0 + nc1 + nc2 + nc3 + ............ + ncn
        // which is equal to 2^n

        return(int)(Math.pow(2,rowNo));
    }

}
