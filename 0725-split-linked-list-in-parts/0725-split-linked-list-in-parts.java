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
    public ListNode[] splitListToParts(ListNode head, int k) {

        int n = 0;
        ListNode tail = head;
        while(tail !=null){
            tail = tail.next;
            n++;
        }

        int partsize = n/k;  
        int partswithextra = n%k;
       
        ListNode[] res = new ListNode[k];
        ListNode current = head;

        for(int i = 0;i<k;i++){
           int sublistsize = i<partswithextra? (partsize+1): partsize;

           if(sublistsize == 0){
            res[i] = null;
           }else{
            ListNode sublisthead = current;
            for(int j = 0;j<sublistsize-1;j++){
                current= current.next;
            }
            ListNode nextnode = current.next;
            current.next = null;
            res[i] =sublisthead;
            current = nextnode;


           }
        }
        


    return res;

        
    }
}