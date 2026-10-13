// Problem: Reverse Linked List
// Platform: LeetCode
// Problem Number: 206
// Difficulty: Easy
// Topic: Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while (curr != null) {
            next = curr.next;  // Save the next node
            curr.next = prev;  // Reverse the link
            prev = curr;       // Move prev forward
            curr = next;       // Move curr forward
        }

        return prev;
    }
}
