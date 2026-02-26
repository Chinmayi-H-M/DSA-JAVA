// Problem: Palindrome Number
// Platform: LeetCode
// Difficulty: Easy
// Topic: Math
class Solution {

    // Time Complexity: O(log10 n)
    // Space Complexity: O(1)

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}

/*
Approach:
1. Negative numbers cannot be palindrome.
2. Reverse only half of the number to avoid overflow.
3. Compare first half and reversed second half.
4. For odd length numbers, ignore the middle digit.
*/
