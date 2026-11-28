
/*
 * Problem: 61. Rotate List
 * Difficulty: Medium
 *
 * Approach: Linked List + Length Calculation
 *
 * Idea:
 * Rotate the linked list to the right by k positions.
 *
 * Steps:
 * 1. Handle edge cases (null, single node, k = 0).
 * 2. Calculate the length of the linked list.
 * 3. Reduce k using k % len because rotating by
 *    the list length gives the original list.
 * 4. Connect the last node to the head to form a circle.
 * 5. Find the new tail at position (len - k).
 * 6. The next node becomes the new head.
 * 7. Break the circular connection.
 */

class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        // Handle edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int len = 1;

        // Calculate length and find the last node
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Remove unnecessary rotations
        k = k % len;

        if (k == 0) {
            return head;
        }

        // Connect last node to head (circular list)
        temp.next = head;

        // Find the new tail
        int steps = len - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Identify new head
        ListNode newHead = newTail.next;

        // Break the circular connection
        newTail.next = null;

        return newHead;
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(n)
     * - Finding the length: O(n).
     * - Finding the new tail: O(n).
     * - Other operations: O(1).
     *
     * Auxiliary Space Complexity: O(1)
     * - Only a fixed number of pointers and variables
     *   are used.
     *
     * Overall Space Complexity: O(1)
     */
}
