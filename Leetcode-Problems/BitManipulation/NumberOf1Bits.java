// Problem: Number of 1 Bits
// Platform: LeetCode
// Problem Number: 191
// Difficulty: Easy
// Topic: Bit Manipulation
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int hammingWeight(int n) {

        int count = 0;

        while (n > 0) {

            // Check if the last bit is 1
            if ((n & 1) != 0) {
                count++;
            }

            // Remove the last bit
            n = n >> 1;
        }

        return count;
    }
}
