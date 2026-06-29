class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Delete head node
        if (n == length) {
            return head.next;
        }

        curr = head;

        for (int i = 1; i < length - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}