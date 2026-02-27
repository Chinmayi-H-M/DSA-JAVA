// Problem: Add Digits
// Platform: LeetCode
// Difficulty: Easy
// Topic: Math

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int addDigits(int num) {

        while (num >= 10) {   // Repeat until single digit

            int sum = 0;

            while (num > 0) { // Extract digits
                sum += num % 10;
                num /= 10;
            }

            num = sum; // Replace num with digit sum
        }

        return num;
    }
}

/*
Approach:
1. Keep summing digits until number becomes single digit.
2. Extract digits using % 10.
3. Reduce number using / 10.
4. Repeat process if result still has more than one digit.
*/
