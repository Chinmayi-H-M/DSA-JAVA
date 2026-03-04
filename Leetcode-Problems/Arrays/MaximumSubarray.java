// Problem: Maximum Subarray
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Dynamic Programming (Kadane's Algorithm)

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Choose between starting new subarray or extending previous
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

/*
Approach (Kadane's Algorithm):

1. Track the current subarray sum.
2. At each element, decide whether to:
   - start a new subarray
   - extend the current subarray.
3. Update the maximum sum whenever a larger sum is found.
*/
