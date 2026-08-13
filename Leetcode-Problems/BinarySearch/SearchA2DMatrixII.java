// Problem: Search a 2D Matrix II
// Platform: LeetCode
// Difficulty: Medium
// Topic: Matrix / Binary Search

class Solution {

    // Time Complexity: O(m + n)
    // Space Complexity: O(1)

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }

            // Current value is too large
            // Move left
            else if (matrix[row][col] > target) {
                col--;
            }

            // Current value is too small
            // Move down
            else {
                row++;
            }
        }

        return false;
    }
}

/*
Approach:
1. Start from the top-right corner.
2. If the current value equals target, return true.
3. If the current value is greater than target, move left.
4. If the current value is smaller than target, move down.
5. Continue until the target is found or we leave the matrix.
*/
