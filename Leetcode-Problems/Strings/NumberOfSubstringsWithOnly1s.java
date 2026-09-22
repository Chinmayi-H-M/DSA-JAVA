// Problem: Number of Substrings With Only 1s
// Platform: LeetCode
// Problem Number: 1513
// Difficulty: Medium
// Topic: Strings / Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int numSub(String s) {

        long count = 0;
        long ans = 0;
        long mod = 1000000007;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                count++;

                // Every new consecutive 1 creates 'count' new substrings
                ans = (ans + count) % mod;
            } else {
                count = 0;
            }
        }

        return (int) ans;
    }
}
