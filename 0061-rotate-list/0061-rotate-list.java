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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0){
            return head;
        }

        ListNode current = head;

        int listlength = 1;

        while(current.next!=null){
            current = current.next;
            listlength++;
        }

        current.next = head;

        k=k%listlength;

        k = listlength - k;

        while(k>0){
            current = current.next;
            k--;
            
           
        }

        head = current.next;
            current.next = null;

        return head;




        }
        
    }
