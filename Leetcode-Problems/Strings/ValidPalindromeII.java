// Problem: Valid Palindrome II
// Platform: LeetCode
// Difficulty: Easy
// Topic: Strings, Two Pointers

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // If mismatch occurs,
            // try skipping either left or right character
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                        || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    // Helper function to check palindrome
    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

/*
Approach:
1. Use two pointers from both ends.
2. If characters match, move both pointers.
3. On first mismatch, try:
   - Skipping the left character.
   - Skipping the right character.
4. If either remaining substring is a palindrome,
   return true.
5. Otherwise return false.
*/
