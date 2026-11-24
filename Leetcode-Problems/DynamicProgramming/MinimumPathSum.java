
import java.util.*;

class Solution {

    /*
     * Problem: 64. Minimum Path Sum
     * Difficulty: Medium
     *
     * Approach: Dynamic Programming (Tabulation)
     *
     * Idea:
     * Find the minimum sum path from the top-left
     * corner to the bottom-right corner.
     *
     * We can only move:
     * 1. Right
     * 2. Down
     *
     * dp[i][j] stores the minimum path sum required
     * to reach cell (i, j).
     *
     * Steps:
     * 1. Initialize the starting cell.
     * 2. Fill the first row because we can only move right.
     * 3. Fill the first column because we can only move down.
     * 4. For remaining cells, choose the minimum
     *    between the top and left cells.
     * 5. Add the current grid value.
     */

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // Starting cell
        dp[0][0] = grid[0][0];

        // First row: Can only come from the left
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // First column: Can only come from above
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the remaining DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = grid[i][j] +
                           Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(m * n)
     * - First row takes O(n).
     * - First column takes O(m).
     * - Remaining cells take O(m * n).
     * - Every cell is processed once.
     *
     * Auxiliary Space Complexity: O(m * n)
     * - A separate 2D DP array is created.
     *
     * Overall Space Complexity: O(m * n)
     * - DP table requires m * n space.
     *
     * Where:
     * m = Number of rows
     * n = Number of columns
     */
}
