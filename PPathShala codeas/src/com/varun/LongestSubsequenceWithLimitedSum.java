package com.varun;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
//        int [] nums = {4,5,2,1};
//        int []queries = {3,10,21};
//        int [] nums = {4,5,2,1};
//        int []queries = {3,10,21};
        int [] nums = {736411,184882,914641,37925,214915};
        int []queries = {331244,273144,118983,118252,305688,718089,665450};
        int []ans = answerQueries(nums,queries);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] answerQueries(int[] nums, int[] queries) {
//        Arrays.sort(nums);
//        Arrays.sort(queries);
//        int n = nums.length;
//        int i = 0;
//        int in = 0;;
//
//        int []ans = new int[queries.length];
//        int sum = 0;
//        int count  = 0;
//        for (int j = 0; j <n ; j++) {
//            sum += nums[j];
//            count++;
//
//            while(in< queries.length){
//                if(sum > queries[in]){
//                    ans[in] = count-1;
//                    in++;
////                }else if(sum > queries[in]){
////                    ans[in] = count -1;
////                    in++;
//                }else{
//                    break;
//                }
//            }
//        }
//        while(in < queries.length){
//            ans[in] = count;
//            in++;
//        }
//        System.out.println(Arrays.toString(ans));
//        return ans;

        int n = nums.length;
        int m = queries.length;
        int[] answer = new int[m];

        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();

        for (int i = 0; i < m; i++) {
            int j = n-1;
            int curSum = sum;
            while (j >= 0 && curSum > queries[i]) {
                curSum -= nums[j];
                j--;
            }
            answer[i] = j + 1;
        }

        return answer;
    }
}
