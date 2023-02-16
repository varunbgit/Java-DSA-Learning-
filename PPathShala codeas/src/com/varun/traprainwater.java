package com.varun;

public class traprainwater {

    public static void main(String[] args) {
        int [] nums = {4,2,0,3,2,5};
        int ans = trap(nums);
        System.out.println(ans);
    }
    public static int trap(int[] height) {
        int n = height.length;
        int water = 0;
        for(int i =1;i<n-1;i++){
            int lmax = height[i];
            for(int j = 0;j<i;j++){
                lmax  = Math.max(lmax,height[j]);
            }
            System.out.println(" lmax " +  lmax);
            int rmax = height[i];
            for(int j = i+1;j<n;j++){
                rmax  = Math.max(rmax,height[i]);
            }
            System.out.println("rmax " + rmax);

            water += Math.min(lmax , rmax ) - height[i];


        }
        return water;
    }

    public static int trap2(int[] height) {
        int water = 0;
        int n = height.length;
        int[] lmax = new int[n];
        int [] rmax = new int[n];

        for (int i = 0; i <n ; i++) {

        }
        return water ;
    }
    public static int trap3(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int lmax = height[0];
        int rmax = height[n-1];
        int ans = 0;
        while(left < right){
            lmax = Math.max(lmax ,height[left]);
            rmax = Math.max(rmax,height[right]);

            if(height[left]  < height[right]){
                ans += Math.min(lmax,rmax) - height[left];
                left++;
            }else{
                ans += Math.min(lmax ,rmax) - height[right];
                right --;
            }
        }
        return ans;
    }

}
