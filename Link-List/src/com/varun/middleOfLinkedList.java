//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

//package com.varun;
//
//public class middleOfLinkedList {
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
//        public ListNode middleNode(ListNode head) {
//            ListNode temp = head;
//            int len = 1;
//
//            while(temp.next != null){
//                temp = temp.next;
//                len++;
//            }
//
//            temp = head;
//            for(int i =0 ;i<len/2;i++){
//                temp  = temp.next;
//            }
//            return temp;
//        }
//    }
//}
