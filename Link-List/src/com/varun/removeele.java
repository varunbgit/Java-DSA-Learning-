//package com.varun;

//203. Remove Linked List Elements
//public class removeele {
//    public ListNode removeElements(ListNode head, int val) {
////approach 1: iterative approach with prev pointer
//
//        if(head == null){
//            return null;
//        }
//
//        ListNode dummy = new ListNode ();
//        dummy.next = head;
//        ListNode c = dummy;
//        ListNode n = head;
//
//
//
//        while(c.next!=null){
//            if(c.next.val==val){
//                c.next = c.next.next;
//            }else{
//                c=c.next;
//            }
//
//
//        }
//        return dummy.next;
//
//    }
//}
