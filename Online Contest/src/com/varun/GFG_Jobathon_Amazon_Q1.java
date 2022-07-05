package com.varun;

//https://drive.google.com/drive/folders/1cfmjRrMxhNW9NW8uvJhTA39HuPJBK1Wu?usp=sharing

public class GFG_Jobathon_AmazonQ1 {
    public static void main(String[] args) {
        int N =9;
        int a 1;
        int[] x = {3,10,10, 6, 5, 3, 7, 5, 1};
    }


//    Did'nt accepted this due to more time complexity o(n^2) in the sorting half
    //check next approach to reduce the complexity

//    Approch 1

    class Solution {
        public static int solve(int N, int a, int[] x) {
            // code here
            int ans = 0;
            for(int i =0;i<x.length;i++){
                x[i] = x[i]-a;
                x[i] = x[i]<0?x[i]*(-1):x[i];
            }//array of distance
            //   System.out.println(Arrays.toString(x));

            for(int i =0;i<x.length-1;i++){
                for(int j =i+1 ;j>0;j--){
                    if(x[j-1]>x[j]){
                        int temp = x[j-1];
                        x[j-1]=x[j];
                        x[j] = temp;
                    }else{
                        break;
                    }
                }//sorted array of distance

            }
            //System.out.println(Arrays.toString(x));

            // int len = x.length;
            // int dis1= x[x.length-1] ;
            // int dis2= x[x.length-2];

            // dis1 = dis1<0?dis1*(-1):dis1;
            // dis2 = dis2<0?dis2*(-1):dis2;

            // ans = dis1+dis2;
            return x[x.length-1]+x[x.length-2];
        }
    }


}
