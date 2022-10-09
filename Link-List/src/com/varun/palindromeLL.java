//package com.varun;

//https://leetcode.com/problems/palindrome-linked-list/submissions/

//public class palindromeLL {
//
//
//    ListNode slow =head;
//    ListNode fast = head;
//
//        while(fast!=null && fast.next!=null){
//        slow = slow.next; //mid node
//        fast = fast.next.next;
//    }
//    ListNode mid = slow;
//    // System.out.println(slow.next.val);
//    ListNode secondhead = reverse(mid);
//    //   System.out.println(secondhead.val);
//    ListNode reversehead = secondhead;
//
//        while(head!=null && secondhead!=null){
//        // System.out.println(head.val + "  " + secondhead.val);
//        if(head.val!=secondhead.val){
//            break;
//        }
//        head = head.next;
//        secondhead = secondhead.next;
//    }
//    reverse(reversehead);
//
//        if(head == null || secondhead==null){
//
//        return true;
//    }
//        return false;
//
//}
//    public ListNode reverse(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        ListNode next = head.next;
//        while(curr!=null){
//            curr.next = prev ;
//            prev = curr;
//            curr = next;
//            if (next!=null){
//                next = next.next;
//            }
//        }
//        return prev;
//
//}
