// Problem: Find Pivot Index
// Platform: LeetCode
// Difficulty: Easy
// Topic: Arrays, Prefix Sum

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            // Check pivot condition
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

/*
Approach:
1. Calculate total sum of array.
2. Traverse array while maintaining left sum.
3. Right sum = totalSum - leftSum - current element.
4. If left sum equals right sum, return index.
5. If no pivot exists, return -1.
*/
