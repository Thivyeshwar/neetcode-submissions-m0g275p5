/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        //move the fast pointers n items;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        
        // moving slow and fast till fast next value becomes null
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //slow will point to the next node we need to remove;
        slow.next = slow.next.next;
        return dummy.next;
    }
}
