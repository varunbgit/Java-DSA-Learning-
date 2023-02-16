package com.varun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Pair33{
    int start ;
    int end ;
    Pair33(int s,int e){
        start = s;
        end = e;
    }
}
public class ActivitySelection {
    public static void main(String[] args) {
        int n = 4;
        int[] start = {1, 3 ,2 ,5};
        int []end = {2, 4, 3, 6};
        System.out.println(activitySelection(start,end,n));
    }
    public static int activitySelection(int start[], int end[], int n){
//        Pair33 [] time = new Pair33[n];
//
//        for (int i = 0; i <n ; i++) {
//            time[i] = new Pair33(start[i],end[i]);
//        }
//        Arrays.sort(time, new Comparator<Pair33>() {
//            @Override
//            public int compare(Pair33 o1, Pair33 o2) {
//
//                if(o1.end > o2.end){
//                    return 1;
//                }
//                if(o1.end == o2.end) {
//                    return 0;
//                }
//
//                return -1;
//            }
//        });
//
//        for (int i = 0; i <n ; i++) {
//            System.out.println(time[i].start + " " + time[i].end);
//        }
//
//
//        int count = 1;
//        int prev_endtime = time[0].end;
//        for (int i = 1; i <n ; i++) {
//            if(time[i].start > prev_endtime){
//                prev_endtime = time[i].end;
//                count++;
//            }
//        }
//        return count;


        ArrayList<Pair33> time = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            time.add(new Pair33(start[i],end[i]));
        }
        time.sort(new Comparator<Pair33>() {
            @Override
            public int compare(Pair33 o1, Pair33 o2) {
                if(o1.end > o2.end)return 1;
                if(o1.end == o2.end)return 0;
                return -1;
            }
        });

        time.sort(Comparator.comparingInt(o-> o.end));
        for (int i = 0; i <n ; i++) {
            System.out.println(time.get(i).start + " " + time.get(i).end);
        }
        int count = 1;
        int prev = time.get(0).end;

        for (int j = 1; j <n ; j++) {
            if(time.get(j).start > prev){
                count++;
                prev = time.get(j).end;
            }

        }
        return count;
    }
}
