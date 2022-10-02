//package com.varun;
//
//public class LL_Cycle_length {
////code to check if cycle exists in LL
//
//    public int  hasCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while( fast!=null  && fast.next !=null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(slow == fast ){
//                //here it is confirmed that cycle exists
//             int len = 0;
//             do{
//                 slow = slow.next;
//                 len++;
//             }
//             while(slow != fast);
//                 return count ;
//            }
//        }
//
//        return -1; // implies no cycle exits
//    }
//}
