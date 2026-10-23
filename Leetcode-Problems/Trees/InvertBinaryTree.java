
/*
 * Problem: Invert Binary Tree
 * Platform: LeetCode
 * Problem Number: 226
 * Difficulty: Easy
 * Topic: Binary Tree, Recursion
 *
 * Approach:
 * Recursively invert the left and right subtrees, then swap
 * the left and right children of the current node.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h), where h is the tree height
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
