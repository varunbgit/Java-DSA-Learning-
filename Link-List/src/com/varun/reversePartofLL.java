//package com.varun;
//  https://leetcode.com/problems/reverse-linked-list-ii/submissions/
//public class reversePartofLL {
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
//        public ListNode reverseBetween(ListNode head, int left, int right) {
//            if(left==right){
//                return head;
//            }
//            ListNode curr = head;;
//            ListNode prev = null;
//
//            for(int i=0;curr!=null && i<left-1;i++){
//                prev = curr;
//                curr = curr.next;
//            }
//            // System.out.println(prev.val);
//            // System.out.println(curr.val);
//            // System.out.println("new ");
//            ListNode last = prev;
//            ListNode newend = curr;
//            ListNode next  = curr.next;
//            prev = null;
//            // ListNode sprev = null;
//            // ListNode spresent = curr;
//            // ListNode snext = curr.next;
//
//            for(int i=0;curr!=null && i<right-left+1;i++){
//                curr.next = prev;
//                prev = curr;
//                curr=next;
//                if(next!=null){
//                    next = next.next;
//                }
//            }
//
//            if(last!=null){
//                last.next = prev;
//            }else{
//                head = prev;
//            }
//            newend.next = curr;
//            return head;
//
//
//        }
//    }
//}
