// Problem: Linked List Cycle II
// Platform: LeetCode
// Problem Number: 142
// Difficulty: Medium
// Topic: Linked List / Fast and Slow Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect the cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Phase 2: Find the cycle's starting node
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}
