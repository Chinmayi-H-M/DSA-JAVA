// Problem: Domino and Tromino Tiling
// Platform: LeetCode
// Problem Number: 790
// Difficulty: Medium
// Topic: Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int numTilings(int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % 1000000007;
        }

        return (int) dp[n];
    }
}
