//package com.varun;
//
//206 Rverse Linked List



//public class ReverseLinkedList {
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
//        public ListNode reverseList(ListNode head) {
//            if(head == null ){
//                return null;
//            }
//            //insertAtfirst
//            ListNode anshead = new ListNode();
//            // ListNode anstemp=  new ListNode();
//            // anstemp = anshead;
//            int size=0;
//
//
//            while(head!=null){
//                if(size == 0){
//                    anshead.val = head.val;
//                    head = head.next;
//                    anshead.next= null;
//
//
//                }else{
//                    ListNode temp = new ListNode(head.val,anshead);
//                    // temp.val = head.value;
//                    //temp.next= anshead;
//                    anshead = temp;
//                    head = head.next;
//                }
//                size++;
//            }
//
//            return anshead;
//        }
//    }

// recursive approach

// ListNode temp = new ListNode();
//
//public void  reverseLL(ListNode node,ListNode head){
//
//        if(node.next == null){
//        head = node;
//        head.next = null;
//        temp = head;
//        return;
//        }
//
//        reverseLL(node.next,head);
//
//        temp.next = node;
//        temp = node;
//        temp.next = null;
//        }


//}
