// Problem: Plus One
// Platform: LeetCode
// Difficulty: Easy
// Topic: Arrays

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n) (only when new array is created)

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}

/*
Approach:
1. Start from last digit.
2. If digit < 9 → increment and return.
3. If digit == 9 → make it 0 and carry forward.
4. If all digits are 9 → create new array with leading 1.
*/
