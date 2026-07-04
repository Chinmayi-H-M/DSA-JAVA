// Problem: Product of Array Except Self
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Prefix Product

class Solution {

    // Time Complexity: O(2n) ~ O(n)
    // Space Complexity: O(1) (excluding output array)

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Store left products
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply with right products
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}

/*
Approach:
1. Store the product of all elements to the left of each index.
2. Traverse from right to left while maintaining the product of elements to the right.
3. Multiply left and right products to get the answer for each index.
4. No division is used.
*/
