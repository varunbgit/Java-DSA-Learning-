package practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int k = 3;
        int n = 7 ;
        List<List<Integer>> ans  =   combinationSum3(k,n);
        for (List<Integer> ls : ans){
            System.out.println(ls.toString());
        }

    }
    static boolean []arr = new boolean[10];
    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans  =new ArrayList<>();

        for(int i=1;i<9;i++){
            if(i>n){
                break;
            }
            ArrayList<Integer> res = new ArrayList <Integer>();
            arr[i] = true;
            find(k-1,n-i,res);
            ans.add(res);
            arr[i] = false;
        }
        return ans;
    }

    public static void find(int k , int n , ArrayList<Integer> res){
        if(k == 1 ){
            if(n < 9 && n>1 && arr[n]== false ){
                res.add(n);
                return;
            }
        }
        for(int i =1 ;i<9;i++){
            if(!arr[i]){
                arr[i] = true;
                find(k-1,n-i,res);
                if(res.size() == k-1){
                    res.add(i);
                    arr[i] = false;
                    return;
                }
                arr[i] = false;
            }

        }


    }
}
