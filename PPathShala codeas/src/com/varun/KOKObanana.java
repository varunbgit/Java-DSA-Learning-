package com.varun;

public class KOKObanana {
    public static void main(String[] args) {
        int []piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles,h);
        System.out.println(ans);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for (int ele : piles){
            if(ele > max ){
                max = ele;
            }
        }
        int s = 1;
        int e  = max;
        int ans = 0;
        while(s<=e){
            int m = (s+e)/2;
            int time = 0 ;
            for (int ele : piles){

//                double c = (double)(ele/m);
                time += Math.ceil(((double)ele/m));
            }
            if(time == h){
                return m;
            }
            if(time > h){
                s = m+1;
            }else{
                e = m-1;
                ans = m;
            }
        }
        return ans;
    }
}
