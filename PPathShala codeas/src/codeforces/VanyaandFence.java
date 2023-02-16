package codeforces;

import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }
        int ans = min(arr,h);
        System.out.println(ans);
    }

    private static int min(int[] arr, int h) {

        int ans = 0;

        for(int ele: arr){
            if(ele > h){
                ans +=2;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
