//1290. Convert Binary Number in a Linked List to Integer

//package com.varun;
//
//public class LinkedListBinaryToDecimal {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public int getDecimalValue(ListNode head) {
//            int [] arr = new int [30];
//            int i=0;
//            ListNode temp = head;
//            while(temp!= null){
//                int bTemp = temp.val;
//                arr[i] = bTemp;
//                i++;
//                temp = temp.next;
//            }
//            //reversing the arr
//            int[] sArr = new int[30];
//            for(int k =0 ;k<i;k++){
//                sArr[ k] = arr[i-k-1];
//            }
//            int ans =0;
//            for(int j = 0;j<i;j++){
//                if(sArr[j] == 1){
//                    ans += Math.pow(2,j);
//                    System.out.println(ans);
//                }
//            }
//            return ans;
//        }
//    }
//}
