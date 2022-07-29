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

//    static int spFibo(int a,int b,int n){
//        int [] ans = new int[n];
//
//        if(ans[n-1] == 0){
//            ans[n-1] = find(a,b,n);
//        }
//
////
//        return ans[n-2] ^ ans[n-3]; //because index is always 1 less
//
//    }
//    static int find(int a,int b,int n){
//        if(n==0){
//            return a;
//        }
//        if (n == 1) {
//            return b;
//        }
//        return find(a,b,n-1) ^ find(a,b,n-2);
//
//    }
        static int spFibo(int a,int b,int n){
        //using top to bottom approach

            int [] arr = new int[n];
            arr[0] = a;
            arr[1] = b;

            for(int i=2;i<n;i++){
                arr[i] = arr[i-1] ^ arr[i-2];
            }

            return arr[n-1];

        }
}
