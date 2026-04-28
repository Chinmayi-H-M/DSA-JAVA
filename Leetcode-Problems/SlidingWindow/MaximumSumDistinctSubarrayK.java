// Problem: Maximum Sum of Distinct Subarrays With Length K
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window, HashSet

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(k)

    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        long windowSum = 0;
        long maxSum = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            // Remove duplicates from window
            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                windowSum -= nums[i];
                i++;
            }

            // Add current element
            set.add(nums[j]);
            windowSum += nums[j];

            // Window size becomes k
            if (j - i + 1 == k) {

                maxSum = Math.max(maxSum, windowSum);

                // Slide window forward
                set.remove(nums[i]);
                windowSum -= nums[i];
                i++;
            }
        }

        return maxSum;
    }
}

/*
Approach:
1. Maintain sliding window with unique elements.
2. Use HashSet to detect duplicates.
3. Track current window sum.
4. If window size reaches k, update maxSum.
5. Slide window forward.
*/
