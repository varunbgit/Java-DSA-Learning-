//package com.varun;
////19. Remove Nth Node From End of List
////https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//public class RemoveNthNodeFromEndofLis {
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
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head.next == null){
//                return null;
//            }
//            ListNode temp = new ListNode();
//            temp=head;
//            int size =0 ;
//            while(temp!=null){
//                temp = temp.next;
//                size++;
//            }
//            ListNode Dummy = new ListNode();
//            Dummy.next  = head;
//            temp = Dummy;
//            for(int i=0;i<size-n;i++){
//                temp = temp.next;
//            }
//            temp.next=temp.next.next;
//            return Dummy.next;
//        }
//    }
//}

//approach2
//
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode start = new ListNode(0);
//        start.next = head;
//        ListNode slow = start;
//        ListNode fast = start;
//
//        for(int i=0;i<n;i++){
//            fast = fast.next;
//        }
//        // System.out.println(fast.val);
//
//        while(fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        //slow is at the required node
//        slow.next = slow.next.next;
//        return start.next;
//    }
//}
