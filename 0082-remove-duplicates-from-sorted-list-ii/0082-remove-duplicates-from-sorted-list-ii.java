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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-100000);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode preNode = null;
        while(curr!= null && curr.next!= null)
        {
            if(curr.val == curr.next.val)
            {
                ListNode ptr = curr;
                ListNode prev = null;

                do{
                    prev = ptr;
                    ptr = ptr.next;
                } while(ptr!= null && prev.val == ptr.val);

                preNode.next = ptr;
                curr = ptr;
                continue;
            }

            preNode = curr;
            curr = curr.next;
        }

        return dummy.next;
    }
}