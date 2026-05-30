// Problem: Matrix Block Sum
// Platform: LeetCode
// Difficulty: Medium
// Topic: Matrix, Prefix Sum

class Solution {

    // Time Complexity: O(m * n * (2k+1)^2)
    // Space Complexity: O(m * n)

    public int[][] matrixBlockSum(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int sum = 0;

                // Traverse block around (i, j)
                for (int r = i - k; r <= i + k; r++) {

                    for (int c = j - k; c <= j + k; c++) {

                        // Check boundaries
                        if (r >= 0 && r < m &&
                            c >= 0 && c < n) {

                            sum += mat[r][c];
                        }
                    }
                }

                answer[i][j] = sum;
            }
        }

        return answer;
    }
}

/*
Approach:
1. For each cell (i, j), consider all cells within distance k.
2. Check matrix boundaries before adding values.
3. Store the block sum in answer[i][j].
4. Return the resulting matrix.
*/
