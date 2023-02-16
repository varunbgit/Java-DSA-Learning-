package codeforces;

import java.math.BigInteger;
import java.util.*;

public class Hamburgers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] n = new int[3];
        int[] p = new int[3];
        long price ;

        long min = 0;
        long max = (long) 1e13;
        for (int i = 0; i <3 ; i++) {
            n[i] = in.nextInt();
        }
        for (int i = 0; i <3 ; i++) {
            p[i] = in.nextInt();
        }
        price = in.nextLong();
        long ans = 0;

        int rb =0 ;
        int rs =0;
        int rc =0;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == 'B'){
                rb++;
            }else if(s.charAt(i) == 'S'){
                rs++;
            }else{
                rc++;
            }
        }
        while ((min <= max)){
            long mid = (min + max)/2;

            long priceOfmid = ck(mid ,n,p ,rb,rc,rs);

            if(priceOfmid > price){
                max =  mid -1;
            }
            else{
                ans  = mid;
                min = mid+1;
            }

        }
        System.out.println(ans);
    }

    public static long ck (long no ,int[] n ,int[] p,int rb,int rc,int rs ){
        return (long) Math.max(0, rb * no - n[0]) * p[0] + (long) Math.max(0, rs * no - n[1]) * p[1] + (long) Math.max(0, rc * no - n[2]) * p[2];
    }
}
