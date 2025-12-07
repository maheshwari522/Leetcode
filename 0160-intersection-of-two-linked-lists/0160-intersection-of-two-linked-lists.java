/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int m = 0;
        int n = 0;
        ListNode currentA  = headA;
        ListNode currentB = headB;
        while(currentA!=null){
            currentA=currentA.next;
            m++;
            
        }

        while(currentB!=null){
            currentB=currentB.next;
            n++;
        }

        currentA = headA;
        currentB= headB;

        
        while(m>n){
            currentA=currentA.next;
            m--;
        }
                
        while(n>m){
                currentB=currentB.next;
                n--;
            }
        

        while(currentA!=currentB){
            currentA=currentA.next;
            currentB=currentB.next;
        }

        return currentA;
        
    }
}