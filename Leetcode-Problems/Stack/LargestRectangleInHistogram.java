// Problem: Largest Rectangle in Histogram
// Platform: LeetCode
// Difficulty: Hard
// Topic: Stack / Monotonic Stack

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {

            // Add a virtual height of 0 at the end
            // to process all remaining bars
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty()
                    && currentHeight < heights[st.peek()]) {

                int height = heights[st.pop()];

                int width = st.isEmpty()
                        ? i
                        : i - st.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        return maxArea;
    }
}

/*
Approach:
1. Maintain a monotonic increasing stack of indices.
2. When a smaller height is found, pop taller bars.
3. For each popped bar:
   - Height = heights[popped index]
   - Width = current index - previous smaller index - 1
4. Calculate the rectangle area.
5. Use a virtual height of 0 at the end to process
   all remaining bars.
*/
