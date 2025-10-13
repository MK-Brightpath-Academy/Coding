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
         ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // prev points to last node before duplicates

        while (head != null) {
            // Detect duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev to the node after all duplicates
                prev.next = head.next;
            } else {
                // Move prev forward if current is unique
                prev = prev.next;
            }
            head = head.next; // Move forward
        }

        return dummy.next;
    }
}