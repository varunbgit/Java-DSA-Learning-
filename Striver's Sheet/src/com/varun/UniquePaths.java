package com.varun;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n =7 ;
        int ans = uniquePaths(m,n) ;
        System.out.println(ans);
    }

    // bruteForce Technique
    public static int uniquePaths(int m, int n) {
        int count = 0;
        count += pathExists(m,n,0,0,count);
//        count+= pathExists(m,n,1,0);

        return count;
    }
    public static int  pathExists(int m ,int n,int x,int y ,int count){
//        int count = 0;

        if(x >= m || y >= n){
            return 0;
        }

        if(x == m-1 && y == n-1){
            return 1;
        }
        count += pathExists(m,n,x+1,y,count) + pathExists(m,n,x,y+1,count);
        /*
        if(pathExists(m,n,x+1,y){
            return count+ 1;
        }
        if(pathExists(m,n,x,y+1){
            return count + 1;
        }*/

        return count;


    }

}
