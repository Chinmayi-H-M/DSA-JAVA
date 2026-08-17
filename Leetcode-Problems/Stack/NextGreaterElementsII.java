// Problem: Next Greater Elements II
// Platform: LeetCode
// Difficulty: Medium
// Topic: Stack / Monotonic Stack / Circular Array

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        // Traverse the circular array twice
        for (int i = 2 * n - 1; i >= 0; i--) {

            int num = nums[i % n];

            // Remove elements that cannot be the
            // next greater element
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // Only fill answer during the first pass
            if (i < n && !stack.isEmpty()) {
                ans[i] = stack.peek();
            }

            stack.push(num);
        }

        return ans;
    }
}

/*
Approach:
1. Since the array is circular, traverse it twice.
2. Use i % n to simulate going around the array.
3. Maintain a monotonic decreasing stack.
4. Remove elements smaller than or equal to the current element.
5. For the original array positions, the stack top is
   the next greater element.
6. If no greater element exists, the answer remains -1.
*/
