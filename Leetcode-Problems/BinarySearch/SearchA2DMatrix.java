// Problem: Search a 2D Matrix
// Platform: LeetCode
// Difficulty: Medium
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log m + log n)
    // Space Complexity: O(1)

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Binary search to find the possible row
        int top = 0;
        int bottom = m - 1;
        int row = -1;

        while (top <= bottom) {

            int mid = top + (bottom - top) / 2;

            if (target >= matrix[mid][0] &&
                target <= matrix[mid][n - 1]) {

                row = mid;
                break;

            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;

            } else {
                top = mid + 1;
            }
        }

        if (row == -1) {
            return false;
        }

        // Binary search inside the selected row
        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (matrix[row][mid] == target) {
                return true;

            } else if (matrix[row][mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

/*
Approach:
1. Binary Search on the rows to find which row can contain target.
2. Once the row is found, perform another Binary Search inside that row.
3. If the target is found, return true.
4. Otherwise, return false.
*/
