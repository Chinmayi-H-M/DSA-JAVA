// Problem: Middle of the Linked List
// Platform: LeetCode
// Problem Number: 876
// Difficulty: Easy
// Topic: Linked List / Fast and Slow Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
