// Problem: Single Number
// Platform: LeetCode
// Problem Number: 136
// Difficulty: Easy
// Topic: Bit Manipulation / XOR
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {

        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;
    }
}
