package com.varun;

public class Fibonaci {
    public static void main(String[] args) {
        int n  = 6;
//        int ans = fiboSimple(n);
//        int ans = fiboMemo(n);
//        System.out.println(ans);

        int ans = fibo(n);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n <= 1){
            return n;
        }
        int prev = 1; // 1st ele
        int sum = 1;       // 2nd ele
        int ans = 0;
        for (int j = 2; j <n ; j++) {
            ans = sum + prev ;
            prev= sum;
            sum  = ans;
        }
        return ans;
    }



    private static int fiboSimple(int i) {
        if(i <= 1){
            return i;
        }
        return fiboSimple(i-1) + fiboSimple(i-2);

    }


    private static int fiboMemo(int n ){
        if(n <= 1){
            return n;
        }
        int[]  arr = new int[n+1];
        for (int i = 0; i <=n ; i++) {
            arr[i]  = -1;
        }
        arr[0] = 0;
        arr[1] = 1;
        int ans = fiboRec(n,arr);
        return ans;
    }
    private static int fibotab(int n) {
        if(n <= 1){
            return n;
        }


        int[]  arr = new int[n+1];
        for (int i = 0; i <=n ; i++) {
            arr[i]  = -1;
        }
        arr[0] = 0;
        arr[1] = 1;
         fibota(2,n,arr);
        return arr[n];

    }

    private static void fibota(int i ,int n, int[] arr) {
        while(i<= n ){
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        }
        return ;
    }

    private static int  fiboRec(int n, int[] arr) {

        if(arr[n] != -1){
            return arr[n];
        }else{
            arr[n] = fiboRec(n-1,arr) + fiboRec(n-2,arr);
            return arr[n];
        }

    }

}
