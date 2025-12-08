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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        ListNode ListNode2 = reverse(slow.next);
        slow.next = null; 

        merge(head,ListNode2);
        
    }

    public ListNode reverse(ListNode slow){
     
        ListNode prev = null;
        ListNode current = slow;

        while(current!=null){
            ListNode temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }

        return prev;

    }

    public void merge(ListNode ListNode1,ListNode ListNode2){
        ListNode current1 = ListNode1;
        ListNode current2 = ListNode2;
        while(current2!=null){
            ListNode temp1 = current1.next;
            ListNode temp2 = current2.next;
            current1.next = current2;
            current2.next = temp1;

            current1 = temp1;
            current2 = temp2;
            



        }
    }
}