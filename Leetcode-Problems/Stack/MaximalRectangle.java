// Problem: Maximal Rectangle
// Platform: LeetCode
// Difficulty: Hard
// Topic: Stack / Monotonic Stack

import java.util.*;

class Solution {

    // Time Complexity: O(rows * cols)
    // Space Complexity: O(cols)

    public int maximalRectangle(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            // Build histogram for the current row
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            // Find largest rectangle in the histogram
            maxArea = Math.max(
                maxArea,
                largestRectangleArea(heights)
            );
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {

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
