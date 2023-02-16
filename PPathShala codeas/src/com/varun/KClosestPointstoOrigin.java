package com.varun;

import java.util.*;

import static java.util.Arrays.sort;

public class KClosestPointstoOrigin {


    public static class Pair {
        int distance;
        int index ;

        Pair(int distance,int index){
            this.distance = distance;
            this.index = index;
        }

    }
    public static class comp implements Comparator<Pair>{
        @Override
        public int compare(Pair p1 ,Pair p2){
             if(p1.distance > p2.distance ){
                 return 1;
             }else{
                 return -1;
             }
        }
    }

    public static void main(String[] args) {
        int [][] nums = {{1,3},{-2,2}};
//        int [][] nums = {{-2,2},{1,3}};
        int [][]ans = kClosest(nums,1);

        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i][0]  + " "  + ans[i][1]);
        }
    }



    public static int[][] kClosest(int[][] points, int k) {
        int [][]ans = new int [k][2];

        List<Pair> dis = new ArrayList<>();

        for(int i=0;i<points.length;i++){
            int d = (points[i][0]*points[i][0] + points[i][1]*points[i][1]);
//            dis.add(new ArrayList());
            dis.add(new Pair(d,i));
        }



        for (int i = 0; i <dis.size() ; i++) {
            System.out.println(dis.get(i).distance + " " + dis.get(i).index);
        }

//        Collections.sort(dis, new Comparator<Pair>() {
//            @Override
//            public int compare(Pair a, Pair b) {
//                int  ans = a.distance > b.distance?1:0;
////                int  ans = a
////                return a.distance < b.distance;
//                return ans;
//            }
//        });

//        Arrays.sort(dis.toArray(), new Comparator<>() {});

//        Arrays.sort(dis, new comp() );
        Collections.sort(dis,new comp());

        for (int i = 0; i <dis.size() ; i++) {
            System.out.println(dis.get(i).distance + " " + dis.get(i).index);
        }


        for(int i = 0;i<k;i++){
            int index = dis.get(i).index;
            ans[i][0] = points[index][0];
            ans[i][1] = points[index][1];
        }

        return ans;
    }
}
