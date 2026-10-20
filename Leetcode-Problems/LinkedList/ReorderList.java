

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge the two halves alternately
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            ListNode nextLeft = left.next;
            ListNode nextRight = right.next;

            left.next = right;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
}
