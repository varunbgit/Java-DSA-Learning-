package com.varun;
//https://leetcode.com/problems/pascals-triangle/description/
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int row =5;
        List<List<Integer>> ans = generate(row);
        for(List<Integer>l : ans ){
            System.out.println(l.toString());
        }

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row, pre  = null;
        for (int i = 0; i <numRows ; i++) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = row;
            ans.add(row);
        }
        return ans;
    }
}
