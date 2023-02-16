package com.varun;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparatorFUn  {
    public static class Pair  implements Comparable<Pair> {
        int distance ;
        int index;
        Pair(int distance,int index){
            this.distance = distance;
            this.index = index ;
        }

        @Override
        public int compareTo(Pair p) {
            return this.distance - p.distance;
        }
    }
    public static void main(String[] args) {
        int k = 1;
        int [][]points = {{1,3},{-2,2}};
//        int [][]points = {{-2,2},{1,3}};
        int [][]ans = kClosest(points,k);
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j] + "->" );
            }
            System.out.println();
        }
    }
    public static int[][] kClosest(int[][] a, int k) {
        int [][]ans = new int[k][2];
        if(a.length == 1){
            return a;
        }

//        ********** Working Code *********

        Pair [] di  = new Pair[a.length];
        for (int i = 0; i <a.length ; i++) {
            int d = a[i][0]*a[i][0] + a[i][1]*a[i][1] ;
            di[i] = (new Pair(d,i));
        }

        for (int i = 0; i <di.length ; i++) {
            System.out.println(di[i].distance + " " + di[i].index);
        }
        Arrays.sort(di);

        for (int i = 0; i <di.length ; i++) {
            System.out.println(di[i].distance + " " + di[i].index);
        }


//        **********Working Code Ends Here ********

        for(int i = 0;i<k;i++){
            int index = di[i].index;
            System.out.println(index);
            ans[i][0] = a[index][0];
            ans[i][1] = a[index][1];
        }

    return ans ;

    }
}
