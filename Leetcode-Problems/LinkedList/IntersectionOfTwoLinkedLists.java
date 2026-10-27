
/*
 * Problem: Intersection of Two Linked Lists
 * Platform: LeetCode
 * Problem Number: 160
 * Difficulty: Easy
 * Topic: Linked List, Two Pointers
 *
 * Approach:
 * Traverse both lists using two pointers.
 * When a pointer reaches the end of its list, redirect it
 * to the head of the other list.
 * Both pointers travel the same total distance and meet at
 * the intersection node, or both become null if no intersection exists.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;

        while(A!=B){
            A = (A==null) ? headB : A.next;
            B = (B==null) ? headA : B.next;
        }
        return A;
    }
}
