// Problem: Palindromic Substrings
// Platform: LeetCode
// Difficulty: Medium
// Topic: Strings, Expand Around Center

class Solution {

    // Time Complexity: O(n²)
    // Space Complexity: O(1)

    public int countSubstrings(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            // Count odd-length palindromes
            count += expand(s, i, i);

            // Count even-length palindromes
            count += expand(s, i, i + 1);
        }

        return count;
    }

    // Expand around the center and count palindromes
    private int expand(String s, int left, int right) {

        int count = 0;

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        return count;
    }
}

/*
Approach:
1. Consider every character as the center of an odd-length palindrome.
2. Consider every pair of adjacent characters as the center of an even-length palindrome.
3. Expand outward while characters match.
4. Count every valid palindrome found.
5. Return the total count.
*/
