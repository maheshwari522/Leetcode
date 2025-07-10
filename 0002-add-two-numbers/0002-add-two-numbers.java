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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode dummy = new ListNode(0);

        ListNode tail = dummy;


        while(l1 != null || l2 != null || carry !=0){

            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;


            int add = digit1+digit2+carry;

            int digit = add%10;
            carry = add/10;

            ListNode newNode = new ListNode(digit);

            tail.next = newNode;
            tail = tail.next;

            if(l1 !=null) l1 =l1.next;
            if(l2 !=null) l2 =l2.next;





        }

        return dummy.next;
        
    }
}