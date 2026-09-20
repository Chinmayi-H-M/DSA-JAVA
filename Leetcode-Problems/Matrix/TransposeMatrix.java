// Problem: Transpose Matrix
// Platform: LeetCode
// Problem Number: 867
// Difficulty: Easy
// Topic: Matrix
// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

class Solution {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] Tmatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Tmatrix[i][j] = matrix[j][i];
            }
        }

        return Tmatrix;
    }
}
