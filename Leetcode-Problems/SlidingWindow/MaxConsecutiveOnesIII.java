// Problem: Max Consecutive Ones III
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

/*
Approach:
1. Expand window using right pointer.
2. Count zeros in current window.
3. If zeros exceed k, shrink window from left.
4. Track maximum valid window size.
*/
