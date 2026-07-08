// Problem: Maximum Product Subarray
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Prefix Product

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Reset product if it becomes zero
            if (prefix == 0) {
                prefix = 1;
            }

            if (suffix == 0) {
                suffix = 1;
            }

            // Prefix product
            prefix *= nums[i];

            // Suffix product
            suffix *= nums[nums.length - 1 - i];

            // Update maximum product
            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }
}

/*
Approach:
1. Traverse the array from left to right (prefix product).
2. Traverse the array from right to left (suffix product).
3. Reset the product to 1 whenever it becomes 0.
4. The maximum product can come from either direction due to negative numbers.
5. Return the maximum product found.
*/
