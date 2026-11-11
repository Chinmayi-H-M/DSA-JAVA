/*
 * Problem: Binary Tree Paths
 * Platform: LeetCode
 * Problem Number: 257
 * Difficulty: Easy
 * Topic: Trees, DFS, Recursion, Strings
 *
 * Approach:
 * Use DFS to traverse the binary tree.
 * Append each node's value to the current path.
 * When a leaf node is reached, add the complete path to result.
 * Otherwise, recursively explore the left and right subtrees.
 *
 * Time Complexity: O(N * H) approximately
 * Space Complexity: O(H) auxiliary space, excluding output.
 * N = Number of nodes, H = Height of the tree.
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String path="";
        dfs(root,path,result);
        return result;

    }
        public void dfs(TreeNode root,String path,List<String> result){
            if(root==null){
                return;
            }
            path+=root.val;
            if(root.left==null && root.right==null){
                result.add(path);
                return;
            }
            path+="->";
            dfs(root.left,path,result);
            dfs(root.right,path, result);
        }
}
