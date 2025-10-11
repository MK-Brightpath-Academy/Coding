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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) return head;

        // Dummy node for easy handling
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy, prevGroupEnd = dummy, next = null;

        // Count the total number of nodes
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Start from dummy
        curr = dummy.next;

        while (count >= k) {
            ListNode groupStart = prevGroupEnd.next;
            ListNode groupEnd = curr;

            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prevGroupEnd.next;
                prevGroupEnd.next = next;
            }

            // Move prevGroupEnd to groupEnd (old head)
            prevGroupEnd = curr;
            curr = curr.next;
            count -= k;
        }

        return dummy.next;
        
    }
}