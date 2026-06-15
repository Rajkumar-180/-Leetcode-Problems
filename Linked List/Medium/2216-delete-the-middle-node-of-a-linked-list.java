// ═══════════════════════════════════════════════════════
// Problem: 2216. Delete the Middle Node of a Linked List
// Difficulty: Medium
// Topics: Linked List, Two Pointers
// Runtime: 4 ms (Beats 19.3%)
// Memory: 202.6 MB (Beats 40.0%)
// Submitted: Jun 15, 2026
// Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// ═══════════════════════════════════════════════════════

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        curr = head;

        for (int i = 0; i < n / 2 - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
