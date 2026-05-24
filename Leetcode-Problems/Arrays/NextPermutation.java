// Problem: Next Permutation
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Step 1: Find first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find element just greater than nums[i]
        if (i >= 0) {

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse remaining part
        reverse(nums, i + 1, n - 1);
    }

    // Reverse helper function
    void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}

/*
Approach:
1. Find first decreasing element from right.
2. Find next greater element from right side.
3. Swap them.
4. Reverse remaining suffix to get next permutation.
*/
