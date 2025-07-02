/**
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
    public boolean hasCycle(ListNode head) {
        // Other newer version
        ListNode slow=head;
        if(slow==null) return false;
        ListNode fast=head.next;
        while(fast!=slow){
            if(fast==null || fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        } 
        return true;
    

        // // Previous version 
        // ListNode slow=head;
        // ListNode fast=head;

        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(slow==fast){
        //         return true;
        //     }
        // }
        // return false;
    }
}