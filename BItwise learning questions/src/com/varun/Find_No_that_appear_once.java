package com.varun;

public class Find_No_that_appear_once {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,3,2,5,7,6,6,5};
        System.out.println(check(arr));
    }
    public static int check(int [] arr ){
        int ans = 0;
        for(int ele:arr){
            ans = ans ^ele;         // num ^ num  =0
                                    // num ^ 0 = num
        }
        return ans;
    }
}
