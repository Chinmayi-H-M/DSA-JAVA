// Problem: Palindrome Linked List
// Platform: LeetCode
// Problem Number: 234
// Difficulty: Easy
// Topic: Linked List / Fast and Slow Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode midNode = midNode(head);

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare both halves
        ListNode right = prev;
        ListNode left = head;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    private ListNode midNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
