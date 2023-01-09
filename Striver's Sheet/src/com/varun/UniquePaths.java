package com.varun;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n =2 ;
        int ans = uniquePaths3(m,n) ;
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
    //optimized approach
    //     using memorizing technique
    public static int uniquePaths3(int m, int n) {
        int[][] noPaths = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                noPaths[i][j] = -1;
            }
        }
//        noPaths[0][0] = paths(m,n,noPaths);

        return paths(0,0,noPaths);
    }
    public static int paths(int sRow, int nCol , int[][] noPaths){
        int m = noPaths.length;
        int n = noPaths[0].length;

        if(sRow >= m || nCol >= n){
            return 0;
        }
        if(sRow == m-1 && nCol == n-1){
            return 1;
        }

        if(noPaths[sRow][nCol] != -1){
            return noPaths[sRow][nCol];
        }

//        noPaths[sRow][nCol] += noPaths[sRow+1][nCol]  + noPaths[sRow][nCol + 1];

        return noPaths[sRow][nCol] =
                paths(sRow +1,nCol,noPaths) +
                paths(sRow ,nCol+1,noPaths) ;


    }


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
