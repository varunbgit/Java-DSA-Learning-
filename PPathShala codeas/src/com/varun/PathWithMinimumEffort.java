package com.varun;

import java.util.PriorityQueue;

class pair{
    int dis ;
    int x;
    int y;
    pair(int d,int _x,int _y){
        dis = d;
        x = _x;
        y = _y;
    }
}
public class PathWithMinimumEffort {

    public static int minimumEffortPath(int[][] heights) {
        int r = heights.length;
        int c = heights[0].length;
        boolean [][]visited = new boolean[r][c];
        int ans = 0;

        PriorityQueue<pair> pq = new PriorityQueue<pair>((x,y)->x.dis - y.dis);
        pq.add(new pair(0,0,0));

        while(!pq.isEmpty()){
            pair curr = pq.poll();
            int x  = curr.x;
            int y = curr.y;
            visited[x][y] = true;
            if(x == r-1 && y==c-1){
                break;
            }
            ans = Math.max(ans, curr.dis);
            int []delrow = {-1,1,0,0};
            int []delcol = {0,0,-1,1};

            for (int i = 0; i <4 ; i++) {
                int nx = x + delrow[i];
                int ny = y + delcol[i];

                if(nx>=0 && ny >=0 && nx<r && ny<c && !visited[nx][ny]){
                    int abs = Math.abs(heights[x][y] - heights[nx][ny]);
                    pq.add(new pair(abs,nx,ny));
                }
            }
        }
        return ans;

    }
}
