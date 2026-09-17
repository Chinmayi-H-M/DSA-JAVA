// Problem: Matrix Diagonal Sum
// Platform: LeetCode
// Problem Number: 1572
// Difficulty: Easy
// Topic: Matrix
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }
}
