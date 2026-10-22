
/*
 * Problem: Convert Sorted Array to Binary Search Tree
 * Platform: LeetCode
 * Problem Number: 108
 * Difficulty: Easy
 * Topic: Binary Tree, Binary Search Tree, Recursion
 *
 * Approach:
 * Choose the middle element as the root, then recursively
 * construct the left and right subtrees from the remaining halves.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(log n) average recursion stack
 */

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        return sortedArrayBST(nums, start, end);
    }

    public TreeNode sortedArrayBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayBST(nums, start, mid - 1);
        root.right = sortedArrayBST(nums, mid + 1, end);

        return root;
    }
}
