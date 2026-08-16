// Problem: Next Greater Element I
// Platform: LeetCode
// Difficulty: Easy
// Topic: Stack / Monotonic Stack / HashMap

import java.util.*;

class Solution {

    // Time Complexity: O(n + m)
    // Space Complexity: O(n)

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int m = nums1.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for every element in nums2
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        // Build answer for nums1
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

/*
Approach:
1. Traverse nums2 from right to left.
2. Use a monotonic decreasing stack to find the
   next greater element for each number.
3. Store each number and its next greater element
   in a HashMap.
4. Traverse nums1 and use the HashMap to construct
   the final answer.
*/
