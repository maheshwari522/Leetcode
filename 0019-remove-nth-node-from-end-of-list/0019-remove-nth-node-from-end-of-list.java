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
        ListNode fast = head;
        if(head == null || head.next == null) return null;

        while(n>=0 && fast!=null){
            fast=fast.next;
            n--;
        }
        ListNode slow = head;
        while(fast!=null){
            fast = fast.next;
            slow=slow.next;
        }
       slow.next = slow.next.next;

       return dummy.next;


        
    }
}