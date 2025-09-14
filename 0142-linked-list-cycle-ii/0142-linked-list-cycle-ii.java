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
    public ListNode detectCycle(ListNode head) {

        //two pointers fast and slow
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) return null;

        //travel till fast and slow becomes equal gthat means there is a cycle
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }

        }

        if(fast != slow) return null;
        
        
        //found the cycle connection now let's find where the cycle start by takinfg additional pointer

        ListNode slow2 = head;
        while(slow2!=slow){
            slow = slow.next;
            slow2 = slow2.next;
        }

        return slow2;
      
    }
}