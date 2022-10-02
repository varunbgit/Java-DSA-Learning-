//https://leetcode.com/problems/linked-list-cycle-ii/submissions/
// /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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

                }
                while(temp!=slow);
                break;
            }
        }

        System.out.println(len);

        if(len <=0){
            return null;
        }
        fast = head;
        slow = head;
        for(int i=0;i<len;i++){
            slow= slow.next;
        }

        while(slow!=fast){
            slow= slow.next;
            fast = fast.next;
        }

        return slow;


    }
}