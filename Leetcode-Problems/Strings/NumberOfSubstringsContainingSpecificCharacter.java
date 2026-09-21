// Problem: Count Substrings Containing Given Character
// Platform: LeetCode
// Problem Number: 2083
// Difficulty: Easy
// Topic: Strings / Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public long countSubstrings(String s, char c) {

        long n = 0;

        // Count occurrences of c
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
            }
        }

        // Number of substrings containing at least one occurrence
        // of c = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}
