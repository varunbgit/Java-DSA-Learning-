package com.varun;
//1672. Richest Customer Wealth
public class RichestMan {
    public static void main(String[] args) {
        int[][] acc={{1,5},{7,3},{3,5}};
        int Rich = WealthCheck(acc);
        System.out.println(Rich);
    }

    private static int WealthCheck(int[][] accounts) {
        int max=0;
        for(int i =0;i<accounts.length;i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
//           Approach 1
//            if(sum>max){
//                max=sum;
//             }
            // Approach 2
            max=Math.max(max,sum);


        }
        return max;
    }
}
