package codeforces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MashaandaBeautifulTree {
        static long flag = 1;
//        static int cnt  = 0;
        static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while(test -- > 0){
            flag = 1;
            count =0;
            int n  =in.nextInt();
            ArrayList<Long> v = new ArrayList<>(n);
            for (int i = 0; i <n ; i++) {
                long x = in.nextLong();
                v.add(x);
            }

            rec(0,n-1,1,n,v);
            if(flag == 1){
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
        }
    }

    public static void rec(int si , int ei , int rl, int rr , ArrayList<Long> v){
        if(si == ei){
            return;
        }
        for (int i = si; i <= ei; i++) {
            if(v.get(i) > rr || v.get(i)< rl){
                flag = 0;
//                return;
            }
        }
        int mid = (si + ei +1)/2;
        if(v.get(si) > v.get(mid)){
            //this needs to be swapped

            count++;
            rec(mid , ei,rl,rl + (rr-rl)/2,v);
            rec(si,mid-1,rl + (rr -rl)/2 +1,rr,v);

        }else{
            //no need of swap here
            rec(si,mid-1,rl,rl+(rr -rl)/2,v);
            rec(mid,ei,rl + (rr-rl)/2 +1,rr,v);
        }
    }
}
