// Problem: Longest Substring Without Repeating Characters
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window, HashSet

import java.util.HashSet;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int n = s.length();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {

            // Remove duplicates from window
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

/*
Approach:
1. Use sliding window with two pointers.
2. Maintain unique characters using HashSet.
3. If duplicate appears, shrink window from left.
4. Track maximum valid window length.
*/
