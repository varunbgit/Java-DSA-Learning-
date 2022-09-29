//package com.varun;
//// https://leetcode.com/problems/merge-two-sorted-lists/
//
////*** This Code is made without splicing the node but by creating new nodes *****
//
//
//
//
//public class MergeTwoSortedLL {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     * int val;
//     * ListNode next;
//     * ListNode() {}
//     * ListNode(int val) { this.val = val; }
//     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode sorted = new ListNode();
//            ListNode temp = sorted;
//            ListNode temp1 = list1;
//            ListNode temp2 = list2;
//
//            while (temp1 != null && temp2 != null) {//&& temp1.next!=null && temp2.next!=null)
////                if (temp1.val == temp2.val) {
////                    temp.val = temp1.val;
////                    temp.next = new ListNode(temp2.val);
////                    temp = temp.next;
////                    temp1 = temp1.next;
////                    temp2 = temp2.next;
////                }
//                 if (temp1.val >= temp2.val) {
//                    temp.next = new ListNode(temp2.val);
//                    temp = temp.next;
//                    temp2 = temp2.next;
//                } else { //if(temp1.val < temp2.val)
//                    temp.next = new ListNode(temp1.val);
//                    temp = temp.next;
//                    temp1 = temp1.next;
//                }
//            }
//
//            if (temp1 == null) {
//                //insert the whole list 2
//                while (temp2 != null) {
//                    temp.next = new ListNode(temp2.val);
//                    temp = temp.next;
//                    temp2 = temp2.next;
//                }
//            } else {
//                //insert the whole list 1
//                while (temp1 != null) {
//                    temp.next = new ListNode(temp1.val);
//                    temp = temp.next;
//                    temp1 = temp1.next;
//                }
//            }
//            temp.next = null;
//            return sorted;
//        }
//    }
//}
