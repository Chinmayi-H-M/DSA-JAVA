// Problem: Kth Smallest Element in a Sorted Matrix
// Platform: LeetCode
// Difficulty: Medium
// Topic: Binary Search on Answer

class Solution {

    // Time Complexity: O(n × log(max - min))
    // Space Complexity: O(1)

    public int kthSmallest(int[][] mat, int k) {

        int n = mat.length;

        int low = mat[0][0];
        int high = mat[n - 1][n - 1];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = countLessEqual(mat, n, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    // Count elements <= target
    private int countLessEqual(int[][] mat, int n, int target) {

        int row = n - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {

            if (mat[row][col] <= target) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        return count;
    }
}

/*
Approach:
1. Binary Search on the answer between the smallest and largest elements.
2. For each mid, count how many elements are <= mid.
3. Start from the bottom-left corner to count efficiently.
4. If count < k, the kth smallest element must be larger.
5. Otherwise, search the left half.
6. The final value of low is the kth smallest element.
*/
