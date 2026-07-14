// Problem: Longest Palindromic Substring
// Platform: LeetCode
// Difficulty: Medium
// Topic: Strings, Two Pointers

class Solution {

    // Time Complexity: O(n²)
    // Space Complexity: O(1)

    public String longestPalindrome(String s) {

        int n = s.length();

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            int len1 = expand(s, i, i);

            // Even length palindrome
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update longest palindrome
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Expand around the center
    private int expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}

/*
Approach:
1. Treat every character as the center of a palindrome.
2. Expand around the center for:
   - Odd-length palindromes
   - Even-length palindromes
3. Keep track of the longest palindrome found.
4. Return the longest palindromic substring.
*/
