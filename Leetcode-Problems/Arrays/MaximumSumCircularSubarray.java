// Problem: Maximum Sum Circular Subarray
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Kadane's Algorithm

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxSum = nums[0];
        int currentMax = nums[0];

        int minSum = nums[0];
        int currentMin = nums[0];

        // Calculate total sum
        for (int num : nums) {
            total += num;
        }

        // Kadane's Algorithm for maximum subarray sum
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        // Kadane's Algorithm for minimum subarray sum
        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of normal and circular subarray
        return Math.max(maxSum, total - minSum);
    }
}

/*
Approach:
1. Find the maximum subarray sum using Kadane's Algorithm.
2. Find the minimum subarray sum using Kadane's Algorithm.
3. Compute the total array sum.
4. Circular subarray sum = totalSum - minimumSubarraySum.
5. If all elements are negative, return maxSum.
6. Otherwise, return the maximum of normal and circular subarray sums.
*/
