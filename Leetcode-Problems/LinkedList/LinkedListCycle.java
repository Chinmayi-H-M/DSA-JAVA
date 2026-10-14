// Problem: Linked List Cycle
// Platform: LeetCode
// Problem Number: 141
// Difficulty: Easy
// Topic: Linked List / Fast and Slow Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
