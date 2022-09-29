package com.varun;

public class ReturnTheCylicNode {

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            //calculate the lenght of cycle
            ListNode slow = head;
            ListNode fast = head;
            int len  = 0;
            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    // cycle exits
                    ListNode temp = slow;
                    do{
                        temp  = temp.next;
                        len = len + 1;
                        System.out.println(len);
                    }
                    while(slow!=temp);
                }
            }


//             fast = head;
//             slow = head;
//             for(int i=0;i<len;i++){
//                  slow= slow.next;
//             }

//             if(slow == fast){
//                 return slow;
//             }

//             // ListNode t = head ;

//             slow= slow.next;
//             fast = fast.next;

            return null;

        }
    }
}
