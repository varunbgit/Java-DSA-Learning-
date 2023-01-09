package com.varun;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        int m = 23;
        int n =12 ;
        int ans = uniquePaths2(m,n) ;
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

//    public static int uniquePaths(int m, int n) {
//
//
//    }


    // most optimized solution
    public static int uniquePaths2(int m, int n) {
        // if we monitor closely to reach the destination with 3 * 2 matrix
        // we will have to take 2 down and 1 right
        //so we have n-1 rights and  m-1 down and we have total of m + n -2 moves
        //ans will be m+n-2C(n-1) or  (m+n-2)C(m-1) to place a down and keep r at left places

        double ans = 1;
        int total = m + n -2 ;
        int rmoves = m-1 ;
        for(int i = 1;i <=rmoves;i++ ){
            ans  = ans * (total - rmoves + i) / i ;
        }
        return (int)(ans) ;
    }

}
