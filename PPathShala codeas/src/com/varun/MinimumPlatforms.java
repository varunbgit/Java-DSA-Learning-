package com.varun;
import java.util.*;


class Pair21{
    int at ;
    int dt;
    Pair21 (int a ,int d ){
        at = a;
        dt = d ;
    }
}
class pair12 {
    int val ;
    char ch;
    pair12(int v,char c){
        val = v;
        ch = c;
    }
}
public class MinimumPlatforms {
    public static void main(String[] args) {
//        int []arr = {900,940,950 ,1100 ,1500, 1800};
//        int []dep = {910 ,1200 ,1120 ,1130 ,1900 ,2000};
        int []arr = {1,2};
        int []dep = {2,4};
        int ans = findPlatform(arr,dep,arr.length);
        System.out.println(ans);

    }


    static int findPlatform(int arr[], int dep[], int n)
    {
        pair12[] time = new pair12[2*n];
        for(int i =0;i<n;i++){
            time[2 * i] = new pair12(arr[i] ,'a');
            time[2 * i +1] = new pair12(dep[i],'d');
            // System.out.println(time[i].val +" " +time[i].ch);
            // System.out.println(time[i+1].val +" " +time[i+1].ch);
        }
//        System.out.println(time.length);
        for(int i = 0;i<time.length;i++){
            System.out.print(time[i].val +"" +time[i].ch + "   ");
        }
        System.out.println();
          Arrays.sort(time ,new Comparator<pair12>(){
             public int compare(pair12 p1 , pair12 p2){
                 if(p1.val == p2.val){
//                     System.out.println(p1.ch + " " + p2.ch);
                     return p1.ch -p2.ch;
                 }
                 return p1.val - p2.val;
             }
         });

        for(int i = 0;i<time.length;i++){
            System.out.print(time[i].val +"" +time[i].ch +"    ");
        }
        System.out.println();
        int ans = 0;
        int max = 0;
         for(int i = 0;i<time.length;i++){
//             System.out.println(time[i].val + time[i].ch);
             if(time[i].ch == 'a'){
                 ans ++;
                 max = Math.max(ans,max);
             }
             else{
                 ans--;
             }
         }
        return max ;

    }

//    static int findPlatform(int arr[], int dep[], int n)
//    {
//        Pair21 []time = new Pair21[n];
//        for(int i =0;i<n;i++){
//             time[i] = new Pair21((arr[i]/100)*60 +(arr[i]%100) ,(dep[i]/100)*60 +(dep[i]%100));
////            time[i] = new Pair21(arr[i],dep[i]);
//        }
//        Arrays.sort(time,Comparator.comparingDouble(o-> o.dt));
//        ArrayList<Integer> ls = new ArrayList<>();
//        for(int i = 0;i<n;i++){
//
//            int index = -1;
//            int closest = -1;
//
//            for(int j= 0; j<ls.size();j++){
//
//                if(ls.get(j) < time[i].at){
//                    closest = Math.max(closest,time[i].dt);
//                    index = j;
//                }
//            }
//            if(index == -1){
//                ls.add(time[i].dt);
//            }else{
//                ls.set(index,time[i].dt);
//
//            }
////            System.out.println(ls.toString());
//        }
//
//        return ls.size();
//    }
}
