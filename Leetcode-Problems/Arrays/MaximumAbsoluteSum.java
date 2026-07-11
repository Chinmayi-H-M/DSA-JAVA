// Problem: Maximum Absolute Sum of Any Subarray
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Kadane's Algorithm

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = nums[0];
        int minEnding = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum subarray sum
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            // Minimum subarray sum
            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}

/*
Approach:
1. Use Kadane's Algorithm to find the maximum subarray sum.
2. Use a modified Kadane's Algorithm to find the minimum subarray sum.
3. The maximum absolute subarray sum is the larger of:
   - Maximum subarray sum
   - Absolute value of minimum subarray sum
4. Return the maximum of these two values.
*/
