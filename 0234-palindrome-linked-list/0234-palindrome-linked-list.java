import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> st = new Stack<>();
        ListNode slow = head, fast = head;

        // Push first half values
        while (fast != null && fast.next != null) {
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip middle for odd length
        if (fast != null) slow = slow.next;

        // Compare second half with stack
        while (slow != null) {
            if (st.pop().intValue() != slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}
