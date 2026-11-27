
class Solution {

    /*
     * Problem: 62. Unique Paths
     * Difficulty: Medium
     *
     * Approach: Dynamic Programming (Tabulation)
     *
     * Idea:
     * Find the number of unique paths from the top-left
     * corner to the bottom-right corner of an m x n grid.
     *
     * We can only move:
     * 1. Right
     * 2. Down
     *
     * dp[i][j] represents the number of ways to reach
     * cell (i, j).
     *
     * Steps:
     * 1. Initialize the first column with 1.
     * 2. Initialize the first row with 1.
     * 3. For every remaining cell, add the number of
     *    ways from the top and left cells.
     */

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // First column: Only one way to reach each cell
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // First row: Only one way to reach each cell
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill the remaining DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(m * n)
     * - Initialize first column: O(m).
     * - Initialize first row: O(n).
     * - Fill remaining cells: O(m * n).
     * - Each cell is calculated once.
     *
     * Auxiliary Space Complexity: O(m * n)
     * - A 2D DP array is used.
     *
     * Overall Space Complexity: O(m * n)
     *
     * Where:
     * m = Number of rows
     * n = Number of columns
     */
}
