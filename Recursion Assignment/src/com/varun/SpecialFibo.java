package com.varun;

//https://www.codechef.com/problems/FIBXOR01/

//f(0) = a;
//        f(1) = b;
//        f(n) = f(n-1) ^ f(n-2);  when n>1, where ^ denotes the bitwise xor operation.
//


import java.util.*;




public class SpecialFibo {
//    static ArrayList<>  list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = in.nextInt();

        int [][] data = new int[n][3];
        for (int i = 0; i <=n-1 ; i++) {
            System.out.println("Ennter the Value of row ");
            for (int j=0;j<3;j++){
                data[i][j] = in.nextInt();
            }
        }

        //for (int i = 0; i <n ; i++) {
            int ans = spFibo(data[0][0],data[0][1],data[0][2]);
            System.out.println(ans);



    }

    static int spFibo(int a,int b,int n){

        /*
        write some basic test cases on paper and we will find like
        if n %3 ==0 ans =a;
                ==1 ans =b;
                ==2 ans =a ^ b;
         */
        if(n%3 == 0){
            return a ;
        }
        if(n%3 ==1){
            return b;
        }
        return a^b;
    }






//        static int spFibo(int a,int b,int n){
//        //using top to bottom approach
//
//            int [] arr = new int[n];
//            arr[0] = a;
//            arr[1] = b;
//
//            for(int i=2;i<n;i++){
//                arr[i] = arr[i-1] ^ arr[i-2];
//            }
//
//            return arr[n-1];
//
//        }
}
