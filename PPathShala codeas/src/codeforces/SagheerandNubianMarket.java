package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SagheerandNubianMarket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            int  n = in.nextInt();
            int s = in.nextInt();
            long[]arr = new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
            }
            int min = 1;
            int max= n;
            int ans = 0;
            int cost = 0;
            while ((min  <= max)){
                int mid = (min+max)/2;
                int p = checker(arr,mid);
                if(p>s){
                    max= mid -1;
                }else{
                    ans = mid;
                    cost = p;
                    min = mid+1;
                }
            }

        System.out.println(ans + " " + cost);


    }
    public static int  checker(long[] arr ,int mid){
        int n = arr.length;
        long []price = new long[n];
        for (int i = 0; i <n ; i++) {
            price [i] = arr[i] + mid * (i+1);
        }
        Arrays.sort(price);

        int p = 0;
//        int i =0;

        for(int i=0;i<mid;i++){
            p+= price[i];

        }
        return p;

    }
}
