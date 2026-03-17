// Problem: Find the Index of the First Occurrence in a String
// Platform: LeetCode
// Difficulty: Easy
// Topic: Strings

class Solution {

    // Time Complexity: O(n * m)
    // Space Complexity: O(1)

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Check substring match
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}

/*
Approach:
1. Iterate through haystack.
2. At each index, try matching substring with needle.
3. If all characters match, return starting index.
4. If no match found, return -1.
*/
