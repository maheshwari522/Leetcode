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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode merged = new ListNode(Integer.MIN_VALUE);
        for(ListNode li:lists){
            if(li!=null){
               merged =  merge(merged,li );
            }
        }

        return merged.next;
    }

    public ListNode merge(ListNode li1, ListNode li2){
        ListNode dummy = new ListNode(-1);
        ListNode current=dummy;
        ListNode p1= li1;
        ListNode p2= li2;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                current.next = p1;
                p1 = p1.next;
            }else{
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        if(p1!=null){
            while(p1!=null){
            current.next=p1;
            p1=p1.next;
            current=current.next;
            }


        }
        if(p2!=null){
            while(p2!=null){
            current.next=p2;
            p2=p2.next;
            current=current.next;
            }

        }

        return dummy.next;
    }
}