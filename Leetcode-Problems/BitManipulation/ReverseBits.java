// Problem: Reverse Bits
// Platform: LeetCode
// Problem Number: 190
// Difficulty: Easy
// Topic: Bit Manipulation
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            // Get the last bit of n
            int bit = n & 1;

            // Shift result left and add the extracted bit
            result = (result << 1) | bit;

            // Move to the next bit
            n = n >> 1;
        }

        return result;
    }
}
