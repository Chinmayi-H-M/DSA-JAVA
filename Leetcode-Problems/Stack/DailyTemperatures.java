// Problem: Daily Temperatures
// Platform: LeetCode
// Difficulty: Medium
// Topic: Stack / Monotonic Stack

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove temperatures that are not warmer
            while (!st.empty() &&
                   temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            // Stack contains the index of the next warmer day
            if (!st.empty()) {
                ans[i] = st.peek() - i;
            }

            // Store index, not temperature
            st.push(i);
        }

        return ans;
    }
}

/*
Approach:
1. Traverse from right to left.
2. Store indices in a monotonic decreasing stack.
3. Remove all days whose temperature is <= current temperature.
4. The stack top gives the next warmer day's index.
5. Difference between indices gives the number of days to wait.
6. If the stack is empty, answer remains 0.
*/
