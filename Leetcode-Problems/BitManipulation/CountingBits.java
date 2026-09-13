// Problem: Counting Bits
// Platform: LeetCode
// Problem Number: 338
// Difficulty: Easy
// Topic: Bit Manipulation / Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] countBits(int n) {

        int[] arr = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i / 2] + (i % 2);
        }

        return arr;
    }
}
