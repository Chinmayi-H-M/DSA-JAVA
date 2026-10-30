
/*
 * Problem: Same Tree
 * Platform: LeetCode
 * Problem Number: 100
 * Difficulty: Easy
 * Topic: Binary Tree, DFS, Recursion
 *
 * Approach:
 * 1. If both nodes are null, return true.
 * 2. If only one node is null, return false.
 * 3. Compare the values of both nodes.
 * 4. Recursively compare the left and right subtrees.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
