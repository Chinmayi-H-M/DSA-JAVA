// Problem: Rotate Array
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        // Place each element in its new position
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            temp[newIndex] = nums[i];
        }

        // Copy rotated array back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

/*
Approach:
1. Compute the effective number of rotations using k % n.
2. Create a temporary array of the same size.
3. For each element, calculate its new index as (i + k) % n.
4. Store the element at its new position in the temporary array.
5. Copy the temporary array back to the original array.
*/
